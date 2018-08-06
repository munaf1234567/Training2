package com.exilant.day4.stratagy;
public class Ewallet  implements payment{
private String email;
private String password;
private String walletname;
@Override
public String toString() {
	return "Ewallet [email=" + email + ", password=" + password + ", walletname=" + walletname + "]";
}

public Ewallet(String email, String password, String walletname) {
	super();
	this.email = email;
	this.password = password;
	this.walletname = walletname;
}

@Override
public void pay(int amt) {
	if(this.walletname.equalsIgnoreCase("paytm"))
	{
		amt=(int)(amt-(amt*0.1));
		System.out.println("paying with paytm and got discount of 10%"+amt);
	}
	else
	{
		System.out.println("paying amount of"+amt+"with wallet"+walletname);
	}
		
	}

}
