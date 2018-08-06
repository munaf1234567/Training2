package com.training.kaFKA;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;



public class kafkaClint {

	public static void main(String[] args) {
		Properties  p= new Properties();
		p.setProperty("bootstrap.servers", "localhost:9092");
		p.setProperty("key.serializer", StringSerializer.class.getName());
		p.setProperty("value.serializer", StringSerializer.class.getName());
		p.setProperty("acks", "1");
		p.setProperty("retries", "3"); 
	for(int i=0;i<10;i++)
	{
		Producer<String, String> producer= new KafkaProducer<>(p);
		ProducerRecord<String, String> producerrec=new ProducerRecord<String, String>("topica", "1", "Testing message from java");
		producer.send(producerrec);
		producer.flush();
		producer.close();
		System.out.println("message sent........");
	}	

	}

}
