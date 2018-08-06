package com.exilant.aop;

public class Acc {
	
	private int accno;
	private String accname;
	private double accbal;
	public int getAccno() {
		System.out.println("getAccno() called");
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccname() {
		System.out.println("getAccname() called");
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getAccbal() {
		System.out.println("getAccbal() called");
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	@Override
	public String toString() {
		return "Acc [accno=" + accno + ", accname=" + accname + ", accbal=" + accbal + "]";
	}
	
	

}
