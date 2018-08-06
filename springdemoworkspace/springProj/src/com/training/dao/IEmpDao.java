package com.training.dao;

import java.util.*;

import javax.sql.DataSource;

import com.training.entity.Emp;

public interface IEmpDao {
	
	public Emp getEmp(int empid);
	public List<Emp> getAllEmps();
	public void insetemp(Emp e);
	public void delemp(int empid);
	public void updateemp(int empid,double empnewsal);
	public void setDatasource(DataSource ds);
	
	

}
