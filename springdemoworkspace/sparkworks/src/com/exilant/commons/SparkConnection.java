package com.exilant.commons;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

public class SparkConnection {
		private static String appName="sampleApp";
		private static String sparkMaster="local[2]";
		private static JavaSparkContext spContext=null;
		private static SparkSession spSesion=null;
		private static String tempdir="/Users/abdulmunnaf/Desktop/spark-werehouse";
		private static  void getConnection()
		{
			if(spContext==null)
			{
				SparkConf conf=new SparkConf().setAppName(appName).setMaster(sparkMaster);

			    spContext = new JavaSparkContext(conf);
			    
			    
			 spSesion=SparkSession.builder().appName(appName).master(sparkMaster).config("spark.sql.warehouse.dir", tempdir).getOrCreate();
			
			
			
			}
			
		}
	public static JavaSparkContext getContext()
	{
		
		if(spContext==null)
		{
			getConnection();
		}
		return spContext;
	}
	
	public static SparkSession getSession()
	{
		
		if(spSesion==null)
		{
			getConnection();
		}
		return spSesion;
	}
	
	

}
