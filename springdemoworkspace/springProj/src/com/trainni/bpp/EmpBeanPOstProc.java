package com.trainni.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.base.Defaulthello;
import com.training.base.HelloService;
//this class can hanndle any class given as obj
public class EmpBeanPOstProc  implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("postProcessBeforeInitialization() called");
		if(bean instanceof HelloService)
		{
			Defaulthello da= (Defaulthello) bean;
			da.setCity(da.getCity().toUpperCase());
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization() called");
		return bean;
	}

}
