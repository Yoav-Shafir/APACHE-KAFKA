package kafka.dev.producer.partitioner;

import java.util.List;
import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;
import org.apache.kafka.common.PartitionInfo;
import org.apache.kafka.common.record.InvalidRecordException;
import org.apache.kafka.common.utils.Utils;

public class FooPartitioner implements Partitioner {

	public void configure(Map<String, ?> configs) {
		
	}

	public void close() {
		
	}

	public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
		
		List<PartitionInfo> partitions = cluster.partitionsForTopic(topic);
        int numPartitions = partitions.size();
        
        // We only expect String keys, so we throw an exception if that is not the case.
        if ((keyBytes == null) || (!(key instanceof String)))
        throw new InvalidRecordException("We expect all messages to have customer name as key");
        
        
        // Foo is hard coded here just for this example,
        // we should use the config in the constructor for those things.
        if (((String) key).equals("Foo")) {
            System.out.println("Puting message with key: Foo to the last topic partition");
        	return numPartitions - 1; // Foo will always go to last partition
        }
        
        // Other records will get hashed to the rest of the partitions
        return (Math.abs(Utils.murmur2(keyBytes)) % (numPartitions - 1));
	}
	
}
