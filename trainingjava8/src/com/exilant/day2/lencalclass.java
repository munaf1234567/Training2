package com.exilant.day2;

public class lencalclass {

	public static void main(String[] args) {
		laninterimpl l= new laninterimpl();
		l.exe(new leninterface() {
			
			@Override
			public int maxlenstr(String s1, String s2) {
				if(s1.length()>s2.length())
				return s1.length();
				else
					return	s2.length();
			}
		}, "one", "twoh");

	}

}
