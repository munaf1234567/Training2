package com.exilant.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspect {
	//this will find in any packages
	//@Before("execution(public double getAccbal())")
	//@Before("execution(* com.exilant.aop.Acc.get*())")
	//@Before("execution(* com.exilant.aop.SBAcc.showBal())")
	@Before("execution ( * get*(*))")
	public void loggingadviceBefore()
	{
		System.out.println("***********************logging before called*******************");
	}
	
	
//	@AfterReturning("execution(* com.exilant.aop.Acc.get*())")
	public void loggingadviceAfter()
	{
		System.out.println("***********************logging after called*******************");
	}
	

}
