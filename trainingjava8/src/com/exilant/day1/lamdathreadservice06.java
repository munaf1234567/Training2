package com.exilant.day1;

import java.util.*;
import java.util.Set;
import java.util.concurrent.*;

public class lamdathreadservice06 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		ExecutorService ec= Executors.newSingleThreadExecutor();
//		ec.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//			System.out.println("hello");
//			
//				
//			}
//		});
//ec.shutdown();
//
//ExecutorService ec1= Executors.newSingleThreadExecutor();
//ec1.execute(()->{System.out.println("hello");
//
//	});
//ec1.shutdown();
//



ExecutorService ec3= Executors.newSingleThreadExecutor();
Set<Callable<String>> cs3= initlizedCallable();
List<Future<String>> res= ec3.invokeAll(cs3);

for(Future temp:res)
{
	System.out.println(temp.get());
}
ec3.shutdown();
}
	
	
	
	
	public static Set<Callable<String>> initlizedCallable()
	{
		Set<Callable<String>> cs= new HashSet<Callable<String>>();
		cs.add(()->"1st callable");
		cs.add(()->"2st callable");
		cs.add(()->"3st callable");
		cs.add(()->"4st callable");
		cs.add(()->"5st callable");
		cs.add(new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				return "cllasble thread in annonomous class";
			}
		});
		
		cs.add(()->{ 
			return "cllasble thread in lambda";
			});
		
		
		return cs;
		
	}
}