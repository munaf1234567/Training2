package com.exilant.day4.servicelocator;

import javax.naming.NamingException;

public class client {

	public static void main(String[] args) {
	
	
	System.out.println("------------------------------------");
	service dbs1= ServiceLocator.getservices("erp");
	dbs1.exe();

	System.out.println("---------------------------------------");
	service dbs31= ServiceLocator.getservices("erp");
	dbs31.exe();
	System.out.println("---------------------------------------");
	
	service dbs= ServiceLocator.getservices("db");
	dbs.exe();

	System.out.println("---------------------------------------");
	service dbs3= ServiceLocator.getservices("db");
	dbs3.exe();
	
	}

}