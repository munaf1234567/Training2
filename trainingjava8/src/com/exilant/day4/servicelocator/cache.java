package com.exilant.day4.servicelocator;

import java.util.*;

public class cache {
	private List<service> services;

	public cache() {
		services= new ArrayList<>();
	}
	
public service getservice(String servicename)
{
	System.out.println("getservice() called");
	for(service ser:services)
	{
		if(ser.getName().equalsIgnoreCase(servicename));
		{
			System.out.println("returning cache services"+servicename+"object");
			return ser;
		}
	}
	return null;
}




public void addsservice(service news)
{
	System.out.println("addsservice() called");
	boolean exist=false;
	for(service ser:services)
	{
		if(ser.getName().equalsIgnoreCase(news.getName()));
		{
			exist=true;
			
		}
	}
	if(!exist)
	{
		services.add(news);
	}
}
}