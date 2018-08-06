package com.exilant.day2;

public interface iemp {
	void sal();
	default void noofHrs()
	{
		System.out.println("iemp-----evry emp has to work 8 hrs");
	}

}
