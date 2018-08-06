package com.exilant.kafka2;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class ProducerMsgCallabd implements Callback {
 private long starttime;
 private int key;
 private String Msg;
	
	
	public ProducerMsgCallabd(long starttime, int key, String Msg) {
	super();
	this.starttime = starttime;
	this.key = key;
	this.Msg = Msg;
}


	@Override
	public void onCompletion(RecordMetadata metadata, Exception exception) {
		//when the message is sent
		long Elapstime=System.currentTimeMillis()-starttime;
		if(metadata != null)
		{
			System.out.println("message: "+Msg+"with key"+key+"sent to"+metadata.partition()+"offest: "+metadata.offset()+"time take "+Elapstime+"ms");
		}
		else
		{
			exception.printStackTrace();
		}
		
	}

}
