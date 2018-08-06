package com.exilant.day4.servicelocator;

public class erpservice implements service {

	@Override
	public String getName() {
		
		return "erp";
	}

	@Override
	public void exe() {
		
		System.out.println("exe erp service");
	}

}
