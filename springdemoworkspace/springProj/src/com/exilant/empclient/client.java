package com.exilant.empclient;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.train.autowire.Mobile;
import com.training.dao.IEmpDaoImp;
import com.training.entity.Emp;

public class client {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Spring-db-context.xml");
		IEmpDaoImp mob=	ctx.getBean("empdaotemp",IEmpDaoImp.class);
		System.out.println(mob);
		//insert
		
		
		Emp e1= new Emp(101, "abc1", 3000);
		Emp e2= new Emp(102, "abc2", 4000);
		Emp e3= new Emp(103, "abc3", 5000);
		Emp e4= new Emp(104, "abc4", 6000);
		System.out.println(mob.getDatasource());
	   mob.setDatasource(mob.getDatasource());
		mob.insetemp(e1);
		mob.insetemp(e2);
		mob.insetemp(e3);
		mob.insetemp(e4);
		//List<Emp>list	=mob.getAllEmps();
	//	System.out.println(list);
		
	

	}

}
