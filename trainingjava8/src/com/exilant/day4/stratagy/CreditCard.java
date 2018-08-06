package com.exilant.day4.stratagy;

public class CreditCard  implements payment{
private String name;
private String cardno;
private String cvv;
private String dateofexp;
private double discount;
private String bankname;

	
	
	public CreditCard(String name, String cardno, String cvv, String dateofexp, double discount, String bankname) {
	super();
	this.name = name;
	this.cardno = cardno;
	this.cvv = cvv;
	this.dateofexp = dateofexp;
	this.discount = discount;
	this.bankname = bankname;
}



	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", cardno=" + cardno + ", cvv=" + cvv + ", dateofexp=" + dateofexp
				+ ", discount=" + discount + ", bankname=" + bankname + "]";
	}



	@Override
	public void pay(int amt) {
	if(this.bankname.equalsIgnoreCase("hdfc"))
	{
		amt=(int)(amt-(amt*0.1));
		System.out.println("paying with hdfc and got discount of 10%"+amt);
	}
	else
	{
		System.out.println("paying amount of"+amt+"with ceditcard"+bankname);
	}
		
	}

}
