package com.exilnt.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.train.autowire.Mobile;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("mesage-resource-context.xml");
		//HelloWorld mob=	(HelloWorld) ctx.getBean("hw");
		String gm=ctx.getMessage("goodmorning", new Object[] {}, null);
		System.out.println(gm);
		String frgm=ctx.getMessage("goodmorning", new Object[] {}, new Locale("FR"));
		System.out.println(frgm);
		System.out.println("---------------------------------------");
		String gm1=ctx.getMessage("helloworld", new Object[] {"ffff","sss"}, null);
		System.out.println(gm1);
		
	}

}
