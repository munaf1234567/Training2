package com.exilant.day3.abstractfactry;

public interface icolor {
void paintcar();
}
class red implements icolor
{

	@Override
	public void paintcar() {
		System.out.println("car painting red color");
		
	}
	
}
class blue implements icolor
{

	@Override
	public void paintcar() {
		System.out.println("car painting blue color");
		
	}
	
}