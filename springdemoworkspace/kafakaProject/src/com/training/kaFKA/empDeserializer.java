package com.training.kaFKA;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Map;


import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class empDeserializer implements Deserializer<Object>{
	  

	    public  byte[] deserialize(String topic, byte[] data) {
	        if (data == null)
	            return null;

	       // return ByteBuffer.wrap(data);
	        return data;
	    }

	    public  void close() {
	        // nothing to do
	    }

	
		public void configure(Map<String,?> configs, boolean isKey) {
			// TODO Auto-generated method stub
			
		}

}
