package com.training.kaFKA;

import java.io.Serializable;

public class employee implements Serializable{
	private int empid;
	private String empname;
	private String empsal;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpsal() {
		return empsal;
	}
	public void setEmpsal(String empsal) {
		this.empsal = empsal;
	}
	public employee(int empid, String empname, String empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	public employee() {
		super();
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}

}
