package kafka.dev.consumer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.kafka.clients.consumer.CommitFailedException;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;
import org.json.JSONObject;

// Simple Consumer which is part of a groupId - EventsCounter.
// Consuming messages and updating in memory events counter map.

// Create the topic:
// $> ./bin/kafka-topics[.sh] --create --zookeeper localhost:2181 --replication-factor 1 --partitions 2 --topic customerEvents

// Start producer and send messages 
// $> ./bin/kafka-console-producer[.sh]  --broker-list localhost:9092 --topic customerEvents

// !Important: run the program before producing events.

public class CommitSpecifiedOffset {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092");
		props.put("group.id", "EventsCounter");
		props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		
		// Create a consumer.
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
		
		// Subscribe to one or more topics.
		consumer.subscribe(Collections.singletonList("customerEvents"));
		
		// Its also possible to subscribe using regex pattern
		// consumer.subscribe(Pattern.compile("test.*"));
		
		/**
		 * 
		 * The Poll Loop:
		 * At the heart of the consumer API is a simple loop for polling the server for more data. 
		 * Once the consumer subscribes to topics, the poll loop handles all details of coordination, 
		 * partition rebalances, heartbeats, and data fetching, 
		 * leaving the developer with a clean API that simply returns available data from the assigned partitions.
		 * 
		 * */
		
		
		// Consuming messages and updating the events counter map.
		Map<String, Integer> eventsCountMap = new HashMap<>();
		
		// A map to manually track offsets.
		Map<TopicPartition, OffsetAndMetadata> currentOffsets = new HashMap<>();
		int count = 0;
		
		try {
			
			// Starting infinite loop.
		    while (true) {
		    	
		    	// Keep polling or die!
		    	// poll() will block for 100ms if data is not available.
		    	ConsumerRecords<String, String> records = consumer.poll(100);
		    	for (ConsumerRecord<String, String> record : records) {
		    		System.out.println("topic: " + record.topic());
		    		System.out.println("partition: " + record.partition());
		    		System.out.println("offset: " + record.offset());
		    		System.out.println("key: " + record.key());
		    		System.out.println("value: " + record.value());
		    		
		    		// Processing usually ends in writing a result in a data store or updating a stored record.
		    		// Here we just updating in memory counter.
		    		
		    		int updatedCount = 1;
		    		if (eventsCountMap.containsKey(record.value())) {
		                updatedCount = eventsCountMap.get(record.value()) + 1;
		            }
		    		eventsCountMap.put(record.value(), updatedCount);
		    		
		    		JSONObject json = new JSONObject(eventsCountMap);
		    		System.out.println(json.toString(4));
		    		
		    		// We update the offsets map with the offset. 
		    		currentOffsets.put(
	    	            new TopicPartition(record.topic(), record.partition()),
	    	            new OffsetAndMetadata(record.offset()+1, "no metadata"));
		    		
		    		// Commit current offsets every 1,000 records.
		    		if (count % 1000 == 0)
		            	consumer.commitAsync(currentOffsets, null);
		    		
		    		count++;
		    	}
		    	
		    	try {
		    		
		    		// Once we are done "processing" all the records in the current batch, 
		    		// we call commitSync to commit the last offset in the batch, before polling for additional messages.
		    		consumer.commitSync();
		    	} catch (CommitFailedException e) {
		    		System.out.println(e.getMessage());
		    	}
		    }
		} finally {
			
			/**
			 * 
			 * This will close the network connections and sockets. 
			 * It will also trigger a rebalance immediately rather than wait for the group coordinator 
			 * to discover that the consumer stopped sending heartbeats and is likely dead, 
			 * which will take longer and therefore result in a longer period of time in which consumers can’t consume messages 
			 * from a subset of the partitions.
			 * 
			 * */
		    consumer.close();
		}
		
	}
}

