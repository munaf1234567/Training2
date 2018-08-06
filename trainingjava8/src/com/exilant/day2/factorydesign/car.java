package com.exilant.day2.factorydesign;

public  abstract class car {
	public static car getcar( caranme cn)
	{
		if(cn==caranme.maruti)
		{
			return new maruti();
		}
		else if(cn==caranme.audi)
		{
			return new Audi();
		}
		else if(cn==caranme.bmw)
		{
			return new bmw();
		}
		else
			return null;
	}

    public abstract	void drive();
}
