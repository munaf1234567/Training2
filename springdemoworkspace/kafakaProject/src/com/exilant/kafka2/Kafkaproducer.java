package com.exilant.kafka2;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

public class Kafkaproducer extends Thread {
	private  KafkaProducer<Integer,String> producer;
	private String topic;
	private boolean isAsync;
	private boolean interrupt;
	private String name;
	
	public Kafkaproducer(String topic, boolean isAsync,String name) {
		super();
		this.topic = topic;
		this.isAsync = isAsync;
		this.interrupt=false;
		this.name=name;
		Properties  pa= new Properties();
	pa.setProperty("bootstrap.servers", kafkaproperties.KAFKA_SERVER_URL+":"+kafkaproperties.KAFKA_SERVER_PORT);
	pa.setProperty("client.id", kafkaproperties.PRODUCER_ID);
	pa.setProperty("key.serializer", IntegerSerializer.class.getName());
	pa.setProperty("value.serializer", StringSerializer.class.getName());
	producer= new org.apache.kafka.clients.producer.KafkaProducer<>(pa);
	
	
	}


	public void run()
	{
		int msgno=1;
				while(!interrupt)
				{
					
					
					String msgstr="msg from producer: "+this.name  +"count"+msgno;
					if(isAsync)
					{ 
						//send Accynchronously
						ProducerRecord<Integer,String> producerrec=new ProducerRecord<Integer,String>(this.topic, msgno,msgstr);
						long stattime=System.currentTimeMillis();
						producer.send(producerrec, new ProducerMsgCallabd(stattime, msgno, msgstr));
						
					}
					else
					{
						try
						{
							//send synchronously
							ProducerRecord<Integer,String> producerrec=new ProducerRecord<Integer,String>(this.topic, msgno,msgstr);
							producer.send(producerrec).get();
							
							
						}
						catch(InterruptedException | ExecutionException e)
						{
							e.printStackTrace();
						}
					}
				}
	}

	
	
	
	public void setInterrupt(boolean interrupt)
	{
		this.interrupt=interrupt;
	}
}
