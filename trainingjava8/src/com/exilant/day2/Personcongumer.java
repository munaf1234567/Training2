package com.exilant.day2;

import java.util.function.Consumer;

public class Personcongumer implements Consumer<Person> {

	@Override
	public void accept(Person t) {
		System.out.println("person id->>>"+t.getPid()+"person name->>>"+t.getName());
		
	}

}
