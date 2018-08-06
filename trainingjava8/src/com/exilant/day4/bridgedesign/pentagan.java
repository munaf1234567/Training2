package com.exilant.day4.bridgedesign;

public class pentagan  extends shape{

	public pentagan(icolor c) {
		super(c);
		
	}

	@Override
	public void applycolor() {
		System.out.println("pentagan is applyed color");
		getC().applycolor();
		
	}

}
