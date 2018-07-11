package kafka.dev.producer;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

class DemoProducerCallback implements Callback {

	public void onCompletion(RecordMetadata recordMetadata, Exception e) {
		System.out.println("Inside callback:");
		if (e != null) {
            e.printStackTrace();
        }
		System.out.println("topic: " + recordMetadata.topic());
		System.out.println("offset " + recordMetadata.offset());
		System.out.println("partition " + recordMetadata.partition());
		
	}
}

public class ProducerAsynchronously {
	
	public static void main(String[] args) {
		Properties kafkaProps = new Properties();
		kafkaProps.put("bootstrap.servers", "localhost:9092");
		kafkaProps.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
		kafkaProps.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		Producer<String, String> producer = new KafkaProducer<String, String>(kafkaProps);
		ProducerRecord<String, String> record = new ProducerRecord<String, String>("topic_test", "key_test_3", "value_test_3");
		
		try {
		    producer.send(record, new DemoProducerCallback());
		    TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
