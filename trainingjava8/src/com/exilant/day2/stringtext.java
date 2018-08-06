package com.exilant.day2;

public class stringtext {

	public static void main(String[] args) {
		leninterface in= (s1,s2)->
		{
			if(s1.length()>s2.length())
				return s1.length();
				else
					return	s2.length();
		};		
		System.out.println(in.maxlenstr("abc", "dcefg"));
		
		
		
		
	}

}
