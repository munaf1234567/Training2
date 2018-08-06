package com.exilant.day2.factorydesign;

public class factoryclint {

	public static void main(String[] args) {
		car c1=car.getcar(caranme.audi);
		c1.drive();
		car c2=car.getcar(caranme.bmw);
		c2.drive();
		car c3=car.getcar(caranme.maruti);
		c3.drive();
		
		
	}

}
