package kafka.dev.avro.schemaEvolution;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

// Using new schema V2 to read old schema V1.

public class BackwardSchemaEvolution {
	
	public static void main(String[] args) throws IOException {
		
		// Create V1 Customer.
		CustomerV1 customerV1 = CustomerV1.newBuilder()
			.setAge(34)
			.setAutomatedEmail(false)
			.setFirstName("John")
			.setLastName("Doe")
			.setHeight(178f)
			.setWeight(75f)
			.build();
		System.out.println("Customer V1 = " + customerV1.toString());
		
		// Write V1 Customer to a file.
		final DatumWriter<CustomerV1> datumWriter = new SpecificDatumWriter<>(CustomerV1.class);
		final DataFileWriter<CustomerV1> dataFileWriter = new DataFileWriter<>(datumWriter);
		dataFileWriter.create(customerV1.getSchema(), new File("customerV1.avro"));
		dataFileWriter.append(customerV1);
		dataFileWriter.close();
		System.out.println("successfully wrote customerV1.avro");
		
		// Read V1 Customer file using V2 Customer schema.
		System.out.println("Reading our customerV1.avro with v2 schema");
		final File file = new File("customerV1.avro");
		final DatumReader<CustomerV2> datumReaderV2 = new SpecificDatumReader<>(CustomerV2.class);
		final DataFileReader<CustomerV2> dataFileReaderV2 = new DataFileReader<>(file, datumReaderV2);
		while (dataFileReaderV2.hasNext()) {
			CustomerV2 customerV2read = dataFileReaderV2.next();
			System.out.println("Customer V2 = " + customerV2read.toString());
		}
		
		System.out.println("Backward schema evolution successful\n\n\n");
	}
}
