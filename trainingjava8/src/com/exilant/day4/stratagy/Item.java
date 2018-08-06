package com.exilant.day4.stratagy;

public class Item {
	private String itemcode;
	private int price;
	private int qty;
	protected String getItemcode() {
		return itemcode;
	}
	protected void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	protected int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	protected int getQty() {
		return qty;
	}
	protected void setQty(int qty) {
		this.qty = qty;
	}
	public Item(String itemcode, int price, int qty) {
		super();
		this.itemcode = itemcode;
		this.price = price;
		this.qty = qty;
	}
	public Item() {
		super();
	}
	
	

}
