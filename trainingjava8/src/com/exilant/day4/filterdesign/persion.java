package com.exilant.day4.filterdesign;

public class persion {
	private String name;
	private String sex;
	private String martialstatus;
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getSex() {
		return sex;
	}
	protected void setSex(String sex) {
		this.sex = sex;
	}
	protected String getMartialstatus() {
		return martialstatus;
	}
	protected void setMartialstatus(String martialstatus) {
		this.martialstatus = martialstatus;
	}
	public persion(String name, String sex, String martialstatus) {
		super();
		this.name = name;
		this.sex = sex;
		this.martialstatus = martialstatus;
	}
	public persion() {
		super();
	}
	@Override
	public String toString() {
		return "persion [name=" + name + ", sex=" + sex + ", martialstatus=" + martialstatus + "]";
	}
	
	

}
