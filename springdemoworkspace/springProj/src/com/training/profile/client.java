package com.training.profile;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;


import com.train.autowire.Mobile;

public class client {

	public static void main(String[] args) {
	//Properties p =new  Properties();
		//p.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "Production");
		//p.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "Development");
		//System.setProperties(p);
//		ApplicationContext ctx= new AnnotationConfigApplicationContext();
//		((AnnotationConfigApplicationContext)ctx).register(AppConfig.class);
		
		
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "Production,Development");
		//System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "Development");
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
//		((AnnotationConfigApplicationContext)ctx).getEnvironment().setActiveProfiles("Production");
//		((AnnotationConfigApplicationContext)ctx).getEnvironment().setActiveProfiles("Development");
		//((AnnotationConfigApplicationContext)ctx).scan("com.training.profile");
		//((AnnotationConfigApplicationContext)ctx).refresh();
		


	}

}
