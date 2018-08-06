package com.exilant.kafka2;

public class clientConsumer {

	public static void main(String[] args) {
		kafkaconsumer consumer= new kafkaconsumer(kafkaproperties.TOPIC2, false);
		consumer.start();

	}

}
