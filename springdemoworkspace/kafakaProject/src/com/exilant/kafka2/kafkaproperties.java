package com.exilant.kafka2;

public interface kafkaproperties {
	String TOPIC1="sample-topic";
	String TOPIC2="sample-topic2";
	String KAFKA_SERVER_URL="localhost";
	int KAFKA_SERVER_PORT=9092;
	int KAFKA_PRODUCER_BFFER_SIZE=100*1024;
	int CONN_TIME_OUT=1000*10*10;
	String CLIENT_ID="SimpleConsumerDemoClient";
	String PRODUCER_ID="SimpleProducerDemoClient";
}
