package kafka.dev.avro.schemaEvolution;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

// Forward schema evolution.
// Reading new Customer schema data (v2) using 
// the old schema Customer V1.

public class ForwardSchemaEvolution {
	
	public static void main(String[] args) throws IOException {
		
		// Create Customer V2.
		CustomerV2 customerv2 = CustomerV2.newBuilder()
			.setAge(25)
			.setFirstName("Mark")
			.setLastName("Simpson")
			.setEmail("mark.simpson@gmail.com")
			.setHeight(160f)
			.setWeight(65f)
			.setPhoneNumber("123-456-7890")
			.build();
		System.out.println("Customer V2 = " + customerv2.toString());
		
		// Write it to a file.
		final DatumWriter<CustomerV2> datumWriterV2 = new SpecificDatumWriter<>(CustomerV2.class);
		final DataFileWriter<CustomerV2> dataFileWriterV2 = new DataFileWriter<>(datumWriterV2);
		dataFileWriterV2.create(customerv2.getSchema(), new File("customerV2.avro"));
		dataFileWriterV2.append(customerv2);
		dataFileWriterV2.close();
		System.out.println("successfully wrote customerV2.avro");
		
		// Read it back using old Customer schema V1
		System.out.println("Reading our customerV2.avro with v1 schema");
		final File file2 = new File("customerV2.avro");
		final DatumReader<CustomerV1> datumReader = new SpecificDatumReader<>(CustomerV1.class);
		final DataFileReader<CustomerV1> dataFileReader = new DataFileReader<>(file2, datumReader);
		while (dataFileReader.hasNext()) {
			CustomerV1 customerV1Read = dataFileReader.next();
			System.out.println("Customer V1 = " + customerV1Read.toString());
		}
		
		System.out.println("Forward schema evolution successful");
	}
}
