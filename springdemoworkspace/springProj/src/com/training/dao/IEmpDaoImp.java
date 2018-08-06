package com.training.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.exi.mapper.Emprowmapper;
import com.training.entity.Emp;

public class IEmpDaoImp implements IEmpDao{
	@Autowired
    private  DataSource ds;
    private JdbcTemplate jtmp;
     
     
     
     
     
     
	@Override
	public Emp getEmp(int empid) {
		System.out.println("getEmp");
		String sql="select * from Emp where ";
		System.out.println(jtmp);

		
		
		return null;
	}

	@Override
	public List<Emp> getAllEmps() {
		System.out.println("getAllEmps");
		String sql="select * from Emp";
	//List<Emp>list=jtmp.queryForList(sql);
		
		return null;
	}

	@Override
	public void insetemp(Emp e) {
		System.out.println("insetemp");
	String sql="insert into Emp values(?,?,?)";
	System.out.println(jtmp);

	jtmp.update(sql,e.getEmptied(),e.getEmpname(),e.getEmpale());
		
	}

	@Override
	public void delemp(int empid) {
		
		
	}

	@Override
	public void updateemp(int empid, double empnewsal) {
		
		
	}

	@Override
	public void setDatasource(DataSource ds) {
		System.out.println("setDatasource() called");
		this.ds=ds;
	this.jtmp=new JdbcTemplate(ds);		
	}
	public DataSource getDatasource() {
		
		return ds;
	}
	
	}

