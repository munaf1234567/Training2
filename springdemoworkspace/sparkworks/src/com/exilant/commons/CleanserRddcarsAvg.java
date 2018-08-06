package com.exilant.commons;

import java.util.Arrays;

import org.apache.spark.api.java.function.Function;

public class CleanserRddcarsAvg implements Function<String, Integer> {
  int sum=0;
	@Override
	public Integer call(String v1) throws Exception {
	String [] attlist=v1.split(",");
	String s=attlist[10];
	int num=Integer.parseInt(s);
	    sum=sum+num;
		return sum; 
	}

	
}
