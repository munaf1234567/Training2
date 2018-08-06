package com.exilant.day3.mvc;

public class empcontroller {
	
	private Emp model;
	private starview sv;
	public Emp getModel() {
		return model;
	}
	public void setModel(Emp model) {
		this.model = model;
	}
	public starview getSv() {
		return sv;
	}
	public void setSv(starview sv) {
		this.sv = sv;
	}
	public empcontroller(Emp model, starview sv) {
		super();
		this.model = model;
		this.sv = sv;
	}
	
	public void updateview(String viewType)
	{
		System.out.println("viewtype"+viewType);
			sv.printemp(model);
	}
	

}
