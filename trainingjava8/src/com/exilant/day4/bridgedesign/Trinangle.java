package com.exilant.day4.bridgedesign;

public class Trinangle  extends shape{

	public Trinangle(icolor c) {
		super(c);
		
	}

	@Override
	public void applycolor() {
		System.out.println("tringle is applyed color");
		getC().applycolor();
		
	}

}
