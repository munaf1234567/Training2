package com.exilant.commons;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class DataSource {

	
		
		
		public static JavaRDD<Integer> getCollData()
		{
			JavaSparkContext spContext = SparkConnection.getContext();
			List<Integer> data=Arrays.asList(3,4,56,43,2,66,77,23);
			JavaRDD<Integer> collData=spContext.parallelize(data);
			collData.cache();
			return collData;
			
		}
		
		
		public static Integer getCollData2()
		{
			JavaSparkContext spContext = SparkConnection.getContext();
			JavaRDD<String> autoDataContent=spContext.textFile("./dada/auto-data.csv");

			String header =autoDataContent.first();
			JavaRDD<String> autoDatawithOutHeader=autoDataContent.filter(s->!s.equals(header));
			List<String> s=autoDatawithOutHeader.collect();
			
			int sum=0;
			int count=s.size();
			for(String s1:s)
			{
				String ss[]=s1.split(",");
				String sss=ss[10];
				int num=Integer.parseInt(sss);
				sum=sum+num;	
			}
         Integer avg=sum/count;
					
     
	return avg;
			
		}
	}

