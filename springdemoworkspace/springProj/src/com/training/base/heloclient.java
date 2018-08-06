package com.training.base;




import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class heloclient {

	public static void main(String[] args) {
ApplicationContext  fact= new ClassPathXmlApplicationContext( "Spring-context.xml");
	HelloService hs=(HelloService)fact.getBean("dhello");
	System.out.println(hs.sayhello());
	

	}

}
