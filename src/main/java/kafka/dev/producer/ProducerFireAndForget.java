package kafka.dev.producer;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerFireAndForget {
	public static void main(String[] args) {
		Properties kafkaProps = new Properties();
		kafkaProps.put("bootstrap.servers", "localhost:9092");
		kafkaProps.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
		kafkaProps.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		// more config:
		kafkaProps.put("aks", "1");
		kafkaProps.put("retries", "3");
		
		Producer<String, String> producer = new KafkaProducer<String, String>(kafkaProps);
		ProducerRecord<String, String> record = new ProducerRecord<String, String>("topic_test", "key_test_1", "value_test_1");
		
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
