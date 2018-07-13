package kafka.dev.avro.generic;

import java.io.File;
import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;

public class GenericRecordExample {
	
	public static void main(String[] args) {
		
		// Create generic record.
		Schema.Parser parser = new Schema.Parser();
		Schema schema = parser.parse("{\n" +
			"     \"type\": \"record\",\n" +
			"     \"namespace\": \"com.example\",\n" +
			"     \"name\": \"Customer\",\n" +
			"     \"fields\": [\n" +
			"       { \"name\": \"first_name\", \"type\": \"string\", \"doc\": \"First Name of Customer\" },\n" +
			"       { \"name\": \"last_name\", \"type\": \"string\", \"doc\": \"Last Name of Customer\" },\n" +
			"       { \"name\": \"age\", \"type\": \"int\", \"doc\": \"Age at the time of registration\" },\n" +
			"       { \"name\": \"height\", \"type\": \"float\", \"doc\": \"Height at the time of registration in cm\" },\n" +
			"       { \"name\": \"weight\", \"type\": \"float\", \"doc\": \"Weight at the time of registration in kg\" },\n" +
			"       { \"name\": \"automated_email\", \"type\": \"boolean\", \"default\": true, \"doc\": \"Field indicating if the user is enrolled in marketing emails\" }\n" +
			"     ]\n" +
			"}");
		
		GenericRecordBuilder customerBuilder = new GenericRecordBuilder(schema);
		
		customerBuilder.set("first_name", "John");
		
		// !Important, if we comment this line for example we'll get a run time error,
		// with generic record the compiler can not know that this field is mandatory.
        customerBuilder.set("last_name", "Doe");
        customerBuilder.set("age", 26);
        customerBuilder.set("height", 175f);
        customerBuilder.set("weight", 70.5f);
        customerBuilder.set("automated_email", false);
        
        GenericData.Record myCustomer = customerBuilder.build();
        System.out.println(myCustomer);
		
		// Write generic record to a file.
		final DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(schema);
		try (DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(datumWriter)) {
			dataFileWriter.create(schema, new File("customer-generic.avro"));
			dataFileWriter.append(myCustomer);
			System.out.println("Written customer-generic.avro");
		} catch (IOException e) {
			System.out.println("Couldn't write file");
			e.printStackTrace();
		}

		// Read the file.
		final File file = new File("customer-generic.avro");
		final DatumReader<GenericRecord> datumReader = new GenericDatumReader<>();
		
		GenericRecord customerRead;
		
		try (DataFileReader<GenericRecord> dataFileReader = new DataFileReader<>(file, datumReader)){
			customerRead = dataFileReader.next();
			System.out.println("Successfully read avro file");
			System.out.println(customerRead.toString());
		
			// get the data from the generic record.
			System.out.println("First name: " + customerRead.get("first_name"));
		
			// read a non existent field - not good for runtime.
			System.out.println("Non existent field: " + customerRead.get("not_here"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
