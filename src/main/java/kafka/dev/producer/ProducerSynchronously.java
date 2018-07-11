package kafka.dev.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerSynchronously {
	public static void main(String[] args) {
		Properties kafkaProps = new Properties();
		kafkaProps.put("bootstrap.servers", "localhost:9092");
		kafkaProps.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
		kafkaProps.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		Producer<String, String> producer = new KafkaProducer<String, String>(kafkaProps);
		ProducerRecord<String, String> record = new ProducerRecord<String, String>("topic_test", "key_test_2	", "value_test_2");
		
		try {
			// wait for a reply from Kafka.
		    producer.send(record).get();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
