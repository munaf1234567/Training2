package com.training.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class heloclient {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/resources/Spring-context.xml");

		//System.out.println(ctx);
		HelloService hs = ctx.getBean("dhello", HelloService.class);
		System.out.println("============");
		System.out.println(hs.sayhello());
		// System.out.println(hs.);
		// XmlBeanFactory f= new XmlBeanFactory(new ClassPathR)

	}

}
