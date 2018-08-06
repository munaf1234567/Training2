package com.exilant.day1;

public class prioritycust {
	private int cid;
	private String  cname;	
	private String  type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "prioritycust [cid=" + cid + ", cname=" + cname + ", type=" + type + "]";
	}
	public prioritycust(int cid, String cname, String type) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.type = type;
	}
	public prioritycust() {
		super();
	}
	
	

}
