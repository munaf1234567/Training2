package com.exilant.day3.mvc;

public class empclient {

	public static void main(String[] args) {
	Emp model= getEmp();
starview view= new starview();
empcontroller controller=new empcontroller(model, view);
controller.updateview("star");

	}

	
	private static Emp getEmp()
	{
		return new Emp(101, "divya");
	}
	
}
