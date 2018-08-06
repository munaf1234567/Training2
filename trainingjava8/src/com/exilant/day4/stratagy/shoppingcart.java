package com.exilant.day4.stratagy;

import java.util.*;

public class shoppingcart {
	
	List<Item> items;

	public shoppingcart() {
		this.items= new ArrayList<>();
	}
	
	public void additems(List<Item> items)
	{
		this.items=items;
	}
	public void additem(Item item)
	{
		this.items.add(item);
	}
	
	public void removeitem(Item item)
	{
		this.items.remove(item);
	}
	

	public void modifyitemcount(List<Item> items)
	{
		System.out.println("no of items"+items.size());
	}
	public int calculatetotal()
	{
		int sum=0;
		for(Item it:items)
		{
			sum=sum+it.getPrice()*it.getQty();
		}
		return sum;	
	}
	
	public void checkout(payment paymentstratgy)
	{
		
		modifyitemcount(items);
		paymentstratgy.pay(calculatetotal());
	}
	
	
}
