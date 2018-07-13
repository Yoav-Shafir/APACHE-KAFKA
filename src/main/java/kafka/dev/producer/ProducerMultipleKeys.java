package kafka.dev.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

// This example is based on a topic with 3 partitions:
// $> kafka-topics --zookeeper 127.0.0.1:2181 --create --topic topic_test --partitions 3 --replication-factor 1
// The idea is to show that after running the code multiple times
// we can see that same keys are in the same partitions.
// Also, running the ConsumerMultipleKeys example will show how parallelism is achieved by running 3 consumers
// where each consumer consumes from different partition.

public class ProducerMultipleKeys {
	public static void main(String[] args) {
		Properties props = new Properties();
		
		props.setProperty("bootstrap.servers", "127.0.0.1:9092");
		props.setProperty("key.serializer", StringSerializer.class.getName());
		props.setProperty("value.serializer", StringSerializer.class.getName());
		props.setProperty("acks", "1");
		props.setProperty("retries", "3");
		props.setProperty("linger.ms", "1");
		
		Producer<String, String> producer = new KafkaProducer<String, String>(props);
		
		// Send 10 messages with different keys.
		for (int key = 0; key < 10; key++) {
			ProducerRecord<String, String> record = 
					new ProducerRecord<String, String>("topic_test", Integer.toString(key), "message that has key: " + Integer.toString(key));
			
			try {
				producer.send(record).get();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		producer.close();
	}
}
