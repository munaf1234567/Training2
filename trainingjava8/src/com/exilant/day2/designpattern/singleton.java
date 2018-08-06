package com.exilant.day2.designpattern;

import java.io.Serializable;

public class singleton  implements Serializable{
private static final singleton ins=new singleton();
private	singleton()
{
	System.out.println("d.c");
}
	

public static singleton getInstance()
{
	return ins;
}

protected Object readResolve()
{
	System.out.println("readResolve()");
	return getInstance();
}
}
