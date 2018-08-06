package com.exilant.mongodb;

import java.io.Serializable;

import com.mongodb.BasicDBObject;

public class Employee  extends BasicDBObject 
{
	
	private int empid;
	private String empname;
	private double empsal;
	private String empemail;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.put("empid", empid);
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.put("empname", empname);
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.put("empsal", empsal);
		this.empsal = empsal;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.put("empemail", empemail);
		this.empemail = empemail;
	}
	public Employee(int empid, String empname, double empsal, String empemail) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empemail = empemail;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empemail=" + empemail
				+ "]";
	}
	
	
	

}
