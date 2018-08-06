package com.exilant.day2;

import java.util.*;

public class persionClient {

	public static void main(String[] args) {
		List<Person> plist= Arrays.asList(
				new Person(101, "gautan"),
				new Person(102, "gautan"),
				new Person(103, "gautan"),
				new Person(104, "gautan")
				);
		plist.forEach(System.out::println);
		Personcongumer pc= new Personcongumer();
		plist.forEach(pc);
		//plist.for

	}

}
