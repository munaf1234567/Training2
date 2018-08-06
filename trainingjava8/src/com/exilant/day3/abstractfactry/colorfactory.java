package com.exilant.day3.abstractfactry;

public class colorfactory extends AbstractFactory {

	@Override
	public ivehicle getVehicle(String vhcle) {
		
		return null;
	}

	@Override
	public icolor getcolor(String color) {
		// TODO Auto-generated method stub
		if(color.equals("red"))
		{
			return new red();
		}
		else if(color.equals("blue"))
		{
			return new blue();
		}
		return null;
	}

}
