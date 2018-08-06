package com.exilant.day4.stratagy;

import java.util.ArrayList;
import java.util.List;

public class client {

	public static void main(String[] args) {
		
		
		
		Item i1= new Item("100",5000,2);
		Item i2= new Item("101",6000,1);
		Item i3= new Item("103",5000,1);
		
		shoppingcart scrt= new shoppingcart();
		scrt.additem(i1);
		scrt.additem(i2);
		scrt.additem(i3);
		System.out.println("total amount"+scrt.calculatetotal());
		payment pay=new Ewallet("abc@gmail.com", "123", "ccav");
		scrt.checkout(pay);
		
		System.out.println("-----------------------------");
       List<Item> items= new ArrayList<>();
		items.add(i1);
		items.add(i2);
		items.add(i3);
		System.out.println("total amount"+scrt.calculatetotal());
		shoppingcart scrt1= new shoppingcart();
		scrt1.additems(items);
		scrt.removeitem(i1);
		System.out.println("total amount"+scrt.calculatetotal());
		payment pay1=new Ewallet("abc@gmail.com", "123333", "ccav");
		scrt.checkout(pay1);
	}

}
