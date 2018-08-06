package com.exilant.commons;

import org.apache.spark.api.java.JavaRDD;

public class Utilities {

	
		public static void printStringRDD(JavaRDD<String> stringRDD,int limit)
		{
			
			for(String temp:stringRDD.take(limit) )
			{
				System.out.println(temp);
			}
			
		}
	
		public static void hold()
		{
			while(true)
			{
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					
				}
			}
		}
}
