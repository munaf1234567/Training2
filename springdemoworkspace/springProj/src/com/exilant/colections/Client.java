package com.exilant.colections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("collextion-context.xml");
	mycoll coll= (mycoll) ctx.getBean("col");
	System.out.println(coll.getQues());
	System.out.println(coll.getAccmap());
	System.out.println(coll.getAddset());
	}

}
