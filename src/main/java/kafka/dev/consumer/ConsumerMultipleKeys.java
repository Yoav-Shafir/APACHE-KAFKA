package kafka.dev.consumer;

import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

// This example is related to the ProducerMultipleKeys example.
// The idea is to show how different consumers consumes different partitions.
// The example is based on the topic:
// $> $> kafka-topics --zookeeper 127.0.0.1:2181 --create --topic topic_test --partitions 3 --replication-factor 1
// Run this code 3 times (3 consumers), then run the ProducerMultipleKeys code few times.
// Check each consumer console to see that each consumer consumes only from 1 partition.

public class ConsumerMultipleKeys {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("bootstrap.servers", "localhost:9092");
		props.setProperty("group.id", "group_test");
		props.setProperty("key.deserializer", StringDeserializer.class.getName());
		props.setProperty("value.deserializer", StringDeserializer.class.getName());
		
		// more config:
		props.setProperty("enable.auto.commit", "true"); // This is already true by default.
		props.setProperty("auto.commit.interval.ms", "1000");
		props.setProperty("auto.offset.reset", "earliest");
		
		// Create a consumer.
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
		
		// Subscribe to one or more topics.
		consumer.subscribe(Collections.singletonList("topic_test"));
		
		try {
			
			// Starting infinite loop.
		    while (true) {
		    	
		    	// Keep polling or die!
		    	// poll() will block for 100ms if data is not available.
		    	ConsumerRecords<String, String> records = consumer.poll(100);
		    	for (ConsumerRecord<String, String> record : records) {
		    		System.out.println("Partition: " + record.partition() +
		    				", Offset: " + record.offset() +
		    				", Key: " + record.key() +
		    				", Value " + record.value());
		    	}
		    }
		} finally {
		    consumer.close();
		}
	}
}

