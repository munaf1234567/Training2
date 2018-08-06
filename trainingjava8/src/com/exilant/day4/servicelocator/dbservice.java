package com.exilant.day4.servicelocator;

public class dbservice implements service {

	@Override
	public String getName() {
		
		return "db";
	}

	@Override
	public void exe() {
		System.out.println("exe db service");
		
	}

}
