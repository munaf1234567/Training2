package com.training.entity;

public class Emp {
	
	private int Emptied;
	private String empname;
	private double empale;
	
	public int getEmptied() {
		return Emptied;
	}

	public void setEmptied(int emptied) {
		Emptied = emptied;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpale() {
		return empale;
	}

	public void setEmpale(double empale) {
		this.empale = empale;
	}

	public Emp(int emptied, String empname, double empale) {
		super();
		Emptied = emptied;
		this.empname = empname;
		this.empale = empale;
	}

	public Emp() {
		super();
	}
	
	

}
