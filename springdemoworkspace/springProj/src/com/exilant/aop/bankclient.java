package com.exilant.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bankclient {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Spring-aop.xml");
		BankingService bs=(BankingService)ctx.getBean("banking");
		SBAcc sba=(SBAcc)bs.getSbacc();
//		System.out.println(sba.getAcc().getAccbal());
//		System.out.println(sba.getAcc().getAccname());
//		System.out.println(sba.getAcc().getAccno());
//		System.out.println(sba.showBal());
		sba.getTest(10);
		bs.setandget("mun");
		//bs.throwexceptin();
	
		System.out.println("----------------------------------");
//		CAAcc2 cca=(CAAcc2)bs.getCcacc();
//		System.out.println(cca.getAcc().getAccbal());
//		System.out.println(cca.getAcc().getAccname());
//		System.out.println(cca.getAcc().getAccno());
	}

}
