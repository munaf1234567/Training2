package com.train.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Spring-context4.xml");
		Mobile mob=	ctx.getBean("mob",Mobile.class);
		System.out.println("camera detailcs");
		System.out.println(mob.getCra().getType());
		System.out.println("screen detailcs");
		System.out.println(mob.getScr().getLen());
		System.out.println(mob.getScr().getGlasstype());
		System.out.println(mob.getScr().getBre());
		System.out.println("speak detailcs");
		System.out.println(mob.getSpk().getType());

	}

}
