package com.exilant.day2.designpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class singletonclint04 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		singleton s1=singleton.getInstance();
		System.out.println(s1.hashCode());
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("s1.txt"));
		out.writeObject(s1);
		System.out.println("after deserila");
		
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("s1.txt"));
		singleton s2=(singleton)ois.readObject();
		System.out.println(s2.hashCode());

	}

}
