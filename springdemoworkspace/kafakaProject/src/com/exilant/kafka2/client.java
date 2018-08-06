package com.exilant.kafka2;

public class client {

	public static void main(String[] args) {
		Boolean isAsync=true;
	Kafkaproducer producer= new Kafkaproducer(kafkaproperties.TOPIC2, isAsync, "FirstTest");
	producer.start();
	try
	{
		Thread.sleep(500);
	}
    catch(InterruptedException e)
	{
	 
	}
	producer.setInterrupt(true);
	}

}
