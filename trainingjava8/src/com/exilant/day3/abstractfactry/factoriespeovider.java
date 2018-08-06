package com.exilant.day3.abstractfactry;

public class factoriespeovider {

	
	public static AbstractFactory getfactory(String factoryname)
	{
		if(factoryname.equals("vehicle"))
		{
			return new vehiclefactory();
		}
		else if(factoryname.equals("color"))
		{
			return new colorfactory();
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		

	}

}
