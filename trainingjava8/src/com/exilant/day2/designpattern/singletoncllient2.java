package com.exilant.day2.designpattern;

public class singletoncllient2 {
	
	public static void main(String[] args) {
	
		company c1= company.getInstance(null);
		System.out.println(c1.hashCode());
		Emp epl= new Emp();
		epl.eid=101;
		//epl.cmpny="abc";
		company c2= company.getInstance(null);
		System.out.println(c1.hashCode());
		
	}

}
class company
{
	private company()
	{
		
	}
	public static company getInstance(company c)
	{
		if(c==null)
		{
			return new company();
		}
		return  c;
	}
}
class Emp
{
	int eid;
	String enmae;
	company cmpny;
}