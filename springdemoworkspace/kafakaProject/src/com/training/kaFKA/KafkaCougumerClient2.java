package com.training.kaFKA;

import java.util.Arrays;

import java.util.Date;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

public class KafkaCougumerClient2 {

	public static void main(String[] args) {
		Properties  p= new Properties();
		p.setProperty("bootstrap.servers", "localhost:9092");
		p.setProperty("key.deserializer", com.training.kaFKA.empDeserializer.class.getName());
		p.setProperty("value.deserializer", com.training.kaFKA.empDeserializer.class.getName());
		p.setProperty("group.id", "FirstGroup");
		p.setProperty("session.timeout.ms", "30000");
		p.setProperty("auto.offset.reset", "earliest");
		KafkaConsumer<String,employee> consumer= new  KafkaConsumer<>(p);
		consumer.subscribe(Arrays.asList("topica"));
		while(true)
		{
			ConsumerRecords<String ,employee> consumerRes= consumer.poll(1000);
			System.out.println("count no of mgss got"+consumerRes.count());
			
			for(ConsumerRecord<String,employee> temp:consumerRes)
			{
				System.out.println("key"+temp.key()+"value"+temp.value()+"partition"+temp.partition()+"topic"+temp.topic()+"time"+new Date(temp.timestamp()));
			
		    }
			
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}

}
