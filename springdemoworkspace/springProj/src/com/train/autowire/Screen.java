package com.train.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Screen {
	@Value("${glasstype}")
	private String glasstype;
	@Value("${len}")
	private int len;
	@Value("${bre}")
	private int bre;
	public String getGlasstype() {
		return glasstype;
	}
	public void setGlasstype( String glasstype) {
		this.glasstype = glasstype;
	}
	public int getLen() {
		return len;
	}
	public void setLen( int len) {
		this.len = len;
	}
	public int getBre() {
		return bre;
	}
	public void setBre( int bre) {
		this.bre = bre;
	}
	public Screen(String glasstype, int len, int bre) {
		super();
		this.glasstype = glasstype;
		this.len = len;
		this.bre = bre;
	}
	public Screen() {
		super();
	}
	

}
