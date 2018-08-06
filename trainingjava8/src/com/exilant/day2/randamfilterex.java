package com.exilant.day2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class randamfilterex {

	public static void main(String[] args) {
	int randomno=ThreadLocalRandom.current().nextInt(100,200);
	System.out.println(randomno);
		
	Random r= new Random();
	r.ints(5, 100, 200).forEach(System.out::println);
		System.out.println("--------------------------------------------");
	r.ints(5, 100, 200).sorted().forEach(System.out::println);
	 Stream.iterate(10, i->i+1).limit(10).sorted().forEach(System.out::println);

	}

}
