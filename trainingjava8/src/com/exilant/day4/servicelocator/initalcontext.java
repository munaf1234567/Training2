package com.exilant.day4.servicelocator;

public class initalcontext {
	
	public Object lookup(String jndiname)
	{
		if(jndiname.equalsIgnoreCase("db"))
		{
			System.out.println("loking for db service and create");
			return new dbservice();
		}
		else if(jndiname.equalsIgnoreCase("erp"))
		{
			System.out.println("loking for erp service and create");
			return new erpservice();
		}
		
		return null;
	}
	
	

}
