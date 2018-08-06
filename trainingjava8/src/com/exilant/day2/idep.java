package com.exilant.day2;

public interface idep {
	void workloc();
	default void noofHrs()
	{
		System.out.println("idep----evry emp has to work 8 hrs");
	}

	
	static void comm()
	{
		System.out.println("staic mhod");
	}
}
