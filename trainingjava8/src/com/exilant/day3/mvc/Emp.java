package com.exilant.day3.mvc;

public class Emp {
	
private int empid;
private String empname;
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
@Override
public String toString() {
	return "Emp [empid=" + empid + ", empname=" + empname + "]";
}
public Emp(int empid, String empname) {
	super();
	this.empid = empid;
	this.empname = empname;
}
public Emp() {
	super();
}


}
