package com.exilant.kafka2;

import java.util.Date;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

import com.training.kaFKA.employee;

import kafka.utils.ShutdownableThread;
import scala.reflect.internal.util.Collections;

public class kafkaconsumer extends  ShutdownableThread {

	private KafkaConsumer<Integer, String> consumer;
	private String topic;
	
	
	public kafkaconsumer(String name, boolean isInterruptible) {
		super(name, isInterruptible);
	
		Properties  pa= new Properties();
	pa.setProperty("bootstrap.servers", kafkaproperties.KAFKA_SERVER_URL+":"+kafkaproperties.KAFKA_SERVER_PORT);
	pa.setProperty("key.deserializer", IntegerDeserializer.class.getName());
	pa.setProperty("value.deserializer", StringDeserializer.class.getName());
	pa.setProperty("group.id", "mygroup");
	pa.setProperty("request.timeout.ms", "1000000");
	pa.setProperty("session.timeout.ms", "100000");
	consumer=new KafkaConsumer<>(pa);
	this.topic=topic;
		
	}


	@Override
	public void doWork() {
		consumer.subscribe(java.util.Collections.singleton(this.topic));
		ConsumerRecords<Integer, String> consumerRes= consumer.poll(1000);
		for(ConsumerRecord<Integer, String> temp:consumerRes)
		{
			System.out.println("received msg key"+temp.key()+"message"+temp.value()+"partition"+temp.partition()+"@offset"+temp.offset());
		
	    }
		
		
	}
	
	
	
	

}
