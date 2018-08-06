package com.exilant.day3.composite;

import java.util.*;

public class customar {
	private int custid;
	private String custname;
	private List<customar> ref;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public List<customar> getRef() {
		return ref;
	}
	public void setRef(List<customar> ref) {
		this.ref = ref;
	}
	
	
	public void addRef(customar c)
	{
		this.ref.add(c);
	}
	public void removeRef(customar c)
	{
		this.ref.remove(c);
	}
	public customar(int custid, String custname) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.ref=new ArrayList<>();
	}
	@Override
	public String toString() {
		return "customar [custid=" + custid + ", custname=" + custname + ", ref=" + ref + "]";
	}

	
	
}
