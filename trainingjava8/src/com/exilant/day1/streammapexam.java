package com.exilant.day1;

import java.util.*;
import java.util.stream.Collectors;
// working with filter and map 
public class streammapexam {

	//syntsx upto jdk1.7
	public static List<prioritycust> filtercust(List<customer> custs)
	{
		List<prioritycust> pcs= new ArrayList<>();
		for(customer c:custs)
		{
			if(c.getCparches()>5000)
			{
				pcs.add(new prioritycust(c.getCid(), c.getCname(), "Gold"));
			}
		}
		return pcs;
		
	}
	
	public static List<prioritycust> filtercust1(List<customer> custs)
	{
		List<prioritycust> pcs= custs.stream().map(temp->{
			if(temp.getCparches()>0 && temp.getCparches()<3000)
			{
			return new prioritycust(temp.getCid(), temp.getCname(), "silver");
			}
			else if(temp.getCparches()>3000&& temp.getCparches()<5000)
			{
				return new prioritycust(temp.getCid(), temp.getCname(), "gold");
			}
			else
				return new prioritycust(temp.getCid(), temp.getCname(), "plitnum");
		
		}).collect(Collectors.toList());
		
		return pcs;
	}
	
	
	
	
	public static List<prioritycust> filtercust2(List<customer> custs)
	{
		List<prioritycust> pcs= custs.stream().filter(tem->tem.getCparches()>5000).map(temp->{
			
			return new prioritycust(temp.getCid(), temp.getCname(), "Gold");
			
		}).collect(Collectors.toList());
		
		return pcs;
	}
	public static List<prioritycust> filtercust4(List<customer> custs)
	{
		List<prioritycust> pcs= custs.stream().filter(
				tem->tem.getCparches()>5000).map(temp->{
			
			return new prioritycust(temp.getCid(), temp.getCname(), "Gold");
			
		}).collect(Collectors.toList());
		
		return pcs;
	}
	
	
	public static void main(String[] args) {
		List<customer> cs=Arrays.asList(
				new customer(101, "Ramu", 6000, "eng"),
				new customer(102, "all", 6500, "dev"),
				new customer(103, "poja", 4500, "lead"),
				new customer(104, "anuj", 5600, "eng"),
				new customer(105, "Rtanmay", 4000, "dev"),
				new customer(106, "raju", 2000, "dev"));
		
		filtercust(cs).forEach(System.out::println);
		System.out.println("------------------------");
		
		filtercust1(cs).forEach(System.out::println);
		
		
		System.out.println("------------------------");
		
		
		filtercust2(cs).forEach(System.out::println);
		
		
		
		

	}

}
