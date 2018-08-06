package com.exilant.day2.designpattern;

import java.lang.reflect.*;

public class singletonclint3 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		singleton s1= singleton.getInstance();
		singleton s2= null;
	    singleton s3= null;
		Constructor[] cs=s1.getClass().getDeclaredConstructors();
		for(Constructor c:cs)
		{
			c.setAccessible(true);
			s2=(singleton) c.newInstance();
			s3=(singleton) c.newInstance();
		}

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
