package com.exilant.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspectAfter {
	
//	@After("execution ( * get*())")
//	public void afterGetter1()
//	{
//		System.out.println("***********************logging after called*******************");
//	}
//	
//	
//@AfterReturning("execution ( * get*())")
//public void afterGetter2()
//{
//	System.out.println("***********************logging after returing successfully called*******************");
//}
//
//@AfterReturning(pointcut="args(val)",returning= "returnstr")
//public void afterGetter3(String val,String returnstr)
//{
//	System.out.println("****logging after returing successfully called*"+val+"return"+returnstr);
//}
//		
@AfterThrowing("execution ( * throw*())")
public void afterGetter4()
{
	System.out.println("****logging after throwing called*");
}
}
