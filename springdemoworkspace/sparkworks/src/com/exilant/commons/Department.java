package com.exilant.commons;

public class Department {
	
	private int  deptin;
	private String deptName;
	public int getDeptin() {
		return deptin;
	}
	public void setDeptin(int deptin) {
		this.deptin = deptin;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department(int deptin, String deptName) {
		super();
		this.deptin = deptin;
		this.deptName = deptName;
	}
	public Department() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Department [deptin=" + deptin + ", deptName=" + deptName + "]";
	}
	

}
