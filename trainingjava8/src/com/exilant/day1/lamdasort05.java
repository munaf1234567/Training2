package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lamdasort05 {

	public static void main(String[] args) {
		List<customer> cs=Arrays.asList(
				new customer(101, "ramu", 6000, "eng"),
				new customer(102, "all", 6500, "dev"),
				new customer(103, "poja", 4500, "lead"),
				new customer(104, "anuj", 5600, "eng"),
				new customer(105, "rtanmay", 4000, "dev"),
				new customer(106, "raju", 2000, "dev"));
		System.out.println("b4 sort");
		cs.forEach(System.out::println);
		Collections.sort(cs, new Comparator<customer>(){

			@Override
			public int compare(customer o1, customer o2) {
			
				return o1.getCname().compareTo(o2.getCname());
			}

			
		});
		System.out.println("b4 sort");
		cs.forEach(System.out::println);
		Collections.sort(cs, (o1,o2)->o1.getCname().compareTo(o2.getCname()));
		System.out.println("af sort");
		cs.forEach(System.out::println);
		
		System.out.println("af sort");
		cs.forEach(System.out::println);
		
		cs.sort((o1,o2)->o1.getCname().compareTo(o2.getCname()));
		
		System.out.println("af sort");
		cs.forEach(System.out::println);
		
		
		//sorting asc and desc with same
		Comparator<customer> custnameascomp=(o1,o2)->o1.getCname().compareTo(o2.getCname());
		
		
		Collections.sort(cs, custnameascomp);
		System.out.println("af sort");
		cs.forEach(System.out::println);
		
		Collections.sort(cs, custnameascomp.reversed());
		System.out.println("af sort");
		cs.forEach(System.out::println);
		
	}

}
