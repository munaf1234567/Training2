package com.training.kaFKA;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;



public class kafkaProducerClint2 {

	public static void main(String[] args) {
		Properties  p= new Properties();
		p.setProperty("bootstrap.servers", "localhost:9092");
		p.setProperty("key.serializer", com.training.kaFKA.empSerializer.class.getName());
		p.setProperty("value.serializer", com.training.kaFKA.empSerializer.class.getName());
		p.setProperty("acks", "1");
		p.setProperty("retries", "3"); 
	for(int i=0;i<10;i++)
	{
		Producer<String,byte[]> producer= new KafkaProducer<>(p);
		employee emp= new employee(101, "mun", "20000");
		ProducerRecord<String,byte[]> producerrec=new ProducerRecord<String,byte[]>("topica", emp.toString().getBytes());
		
		producer.send(producerrec);
		producer.flush();
		producer.close();
		System.out.println("message sent........");
	}	

	}

}
