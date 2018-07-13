package kafka.dev.partitioner;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

// Simple "fire and forget" producer that uses the "custom FooPartitioner".
public class Producer1 {
	public static void main(String[] args) {
		Properties kafkaProps = new Properties();
		kafkaProps.put("bootstrap.servers", "localhost:9092");
		kafkaProps.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
		kafkaProps.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer"); 
		
		// Using the custom Partitioner.
		kafkaProps.put("partitioner.class", "kafka.dev.producer.partitioner.FooPartitioner");
		
		
		Producer<String, String> producer = new KafkaProducer<String, String>(kafkaProps);
		
		// Key Foo is for the custom FooPartitioner.
		ProducerRecord<String, String> record = new ProducerRecord<String, String>("topic_test", "Foo", "value_for_FOO_key");
		
		try {
			// The producer accepts ProducerRecord objects.
			// The message will be placed in a buffer and will be sent to the broker in a separate thread.
			// The send() method returns a Java Future object with RecordMetadata.
			// In this example we dont care we just do `fire and forget`.
			// This method of sending messages can be used when dropping a message silently is acceptable
		    producer.send(record);
		    TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
