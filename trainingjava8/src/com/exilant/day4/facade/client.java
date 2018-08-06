package com.exilant.day4.facade;

public class client {

	public static void main(String[] args) {
		FacadeCar fc= new FacadeCar();
		fc.getHbc().drive();
		fc.getSeden().drive();
		fc.getSuv().drive();

	}

}
