package com.exilant.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspectAround {
	

@Around("execution ( * *get*())")
public Object afterGetter4( ProceedingJoinPoint pjp) throws Throwable
{
	Object obj=null;
	System.out.println("****b4 proceding*");
	obj=pjp.proceed();
	System.out.println("****afetrt proceding*");
	return obj;
	
}
}
