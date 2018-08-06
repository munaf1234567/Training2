package com.exilant.day1;

public class customer {
	private int cid;
	private String  cname;
	private double cparches;
	private String designation;
	
	public customer()
	{
		
	}
	public customer(int cid, String cname, double cparches, String designation) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cparches = cparches;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", cparches=" + cparches + ", designation=" + designation
				+ "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCparches() {
		return cparches;
	}
	public void setCparches(double cparches) {
		this.cparches = cparches;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
