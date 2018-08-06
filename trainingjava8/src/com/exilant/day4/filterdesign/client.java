package com.exilant.day4.filterdesign;

import java.util.ArrayList;
import java.util.List;

public class client {

	public static void main(String[] args) {
		List<persion> list= new ArrayList<>();
		list.add(new persion("ab", "male", "single"));
		list.add(new persion("acd", "male", "single"));
		list.add(new persion("abef", "female", "married"));
		list.add(new persion("agh", "female", "married"));
		list.add(new persion("ail", "male", "married"));
		System.out.println("male criteria------------------------------");
		icriteria m1=new Male();
	m1.meetCriteria(list).forEach(System.out::println);
	System.out.println("female criteria-------------------------------");
	icriteria m2=new Female();
	m2.meetCriteria(list).forEach(System.out::println);;
	System.out.println("married criteria-------------------------------");
	icriteria m3=new married();
	m3.meetCriteria(list).forEach(System.out::println);;
	System.out.println("singe criteria-------------------------------");
	icriteria m4=new single();
	m4.meetCriteria(list).forEach(System.out::println);;
	System.out.println("malemarried criteria-------------------------------");
	icriteria m5=new Malemarried();
	m5.meetCriteria(list).forEach(System.out::println);;
	
	System.out.println("and criteria-------------------------------");
	icriteria m6=new andcriteria(m1, m3);
	m6.meetCriteria(list).forEach(System.out::println);;
	System.out.println("malemarried criteria-------------------------------");
	icriteria m7=new orcriteria2(m1, m3);
	m7.meetCriteria(list).forEach(System.out::println);;
	System.out.println("nigate criteria-------------------------------");
//	icriteria m8=new nigatecriteria3(m1);
//	m8.meetCriteria(list).forEach(System.out::println);;
//	System.out.println("nigate criteria-------------------------------");
	icriteria m9=new nigatecriteria3(m2);
	m9.meetCriteria(list).forEach(System.out::println);;
	
	}

}
