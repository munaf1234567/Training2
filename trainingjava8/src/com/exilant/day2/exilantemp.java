package com.exilant.day2;

public class exilantemp implements iemp ,idep{

	@Override
	public void sal() {
		
		System.err.println("sal");
	}

	@Override
	public void workloc() {
		System.out.println("work loc");
		
	}

	@Override
	public void noofHrs() {
		
		idep.super.noofHrs();
		iemp.super.noofHrs();
	}

}
