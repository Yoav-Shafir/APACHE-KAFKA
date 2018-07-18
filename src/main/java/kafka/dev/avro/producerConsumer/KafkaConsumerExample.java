package kafka.dev.avro.producerConsumer;

import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import kafka.dev.avro.specific.Customer;

public class KafkaConsumerExample {

	public static void main(String[] args) {

		Properties properties = new Properties();

		// Normal consumer configuration.
		properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
		properties.put("group.id", "customer-consumer-group-v1");
		properties.put("auto.commit.enable", "false");
		properties.put("auto.offset.reset", "earliest");

		// Avro configuration.
		properties.setProperty("key.deserializer", StringDeserializer.class.getName());
		properties.setProperty("value.deserializer", KafkaAvroDeserializer.class.getName());
		properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");
		properties.setProperty("specific.avro.reader", "true"); // We say we want to read Avro specific record.

		KafkaConsumer<String, Customer> kafkaConsumer = new KafkaConsumer<>(properties);
		String topic = "customer-avro";
		kafkaConsumer.subscribe(Collections.singleton(topic));

		System.out.println("Waiting for data...");

		while (true) {
			System.out.println("Polling");
			ConsumerRecords<String, Customer> records = kafkaConsumer.poll(1000);

			for (ConsumerRecord<String, Customer> record : records) {
				Customer customer = record.value();
				System.out.println(customer);
			}

			kafkaConsumer.commitSync();
		}
	}
}
