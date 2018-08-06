package com.training.base;

import java.util.Random;

public class Defaulthello implements HelloService{
	String name;
	String city;
	
	public Defaulthello() {
		super();
	}

	public Defaulthello(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	//tis value given from comfig file
	
	@Override
	public String sayhello() {
		
		return sayhello(name, city);
	}

	@Override
	public String sayhello(String name, String city) {
		
		String mystr[]= {"hay h r u %s & h is yr cty %s","gm  %s ,r u in %s"," yur city is beautiful %s"};
		Random r1= new Random();
		r1.nextInt(mystr.length);
	    int num=r1.nextInt(mystr.length);
	    System.out.println(num);
	
		return String.format(mystr[num], name,city);
	}

}
