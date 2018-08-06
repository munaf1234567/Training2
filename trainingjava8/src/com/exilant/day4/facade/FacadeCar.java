package com.exilant.day4.facade;

public class FacadeCar {
	private hacthback hbc;
	private sedan seden;
	private suv suv;
	public FacadeCar(hacthback hbc, sedan seden, com.exilant.day4.facade.suv suv) {
		super();
		this.hbc = hbc;
		this.seden = seden;
		this.suv = suv;
	}
	public FacadeCar() {
		this.hbc = new hacthback();
		this.seden = new sedan();
		this.suv = new suv();
	}
	protected hacthback getHbc() {
		return hbc;
	}
	protected void setHbc(hacthback hbc) {
		this.hbc = hbc;
	}
	protected sedan getSeden() {
		return seden;
	}
	protected void setSeden(sedan seden) {
		this.seden = seden;
	}
	protected suv getSuv() {
		return suv;
	}
	protected void setSuv(suv suv) {
		this.suv = suv;
	}
	

}
