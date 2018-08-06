package com.exilant.day4.bridgedesign;

public abstract class shape {
	private icolor c;
	public	shape(icolor c)
	{
		this.c=c;
	}
	
	
	protected icolor getC() {
		return c;
	}


	protected void setC(icolor c) {
		this.c = c;
	}


	public abstract void applycolor();

}
