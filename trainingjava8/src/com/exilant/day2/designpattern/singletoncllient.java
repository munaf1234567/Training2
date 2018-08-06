package com.exilant.day2.designpattern;

public class singletoncllient {

	public static void main(String[] args) {
	
		singleton s1= singleton.getInstance();
		singleton s2= singleton.getInstance();
		singleton s3= singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
