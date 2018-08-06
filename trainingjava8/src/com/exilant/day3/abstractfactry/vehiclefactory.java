package com.exilant.day3.abstractfactry;

public class vehiclefactory extends AbstractFactory{

	@Override
	public ivehicle getVehicle(String vhcle) {
		if(vhcle.equals("car"))
		{
			return new car();
		}
		else if(vhcle.equals("truck"))
		{
			return new truck();
		}
		return null;	}

	@Override
	public icolor getcolor(String color) {
		return null;
	}

}
