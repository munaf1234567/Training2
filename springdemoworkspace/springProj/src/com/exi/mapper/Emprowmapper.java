package com.exi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.entity.Emp;

public class Emprowmapper  implements RowMapper<Emp>{

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emp e= new Emp();
		e.setEmptied(rs.getInt(1));
		e.setEmpname(rs.getString(2));
		e.setEmpale(rs.getDouble(3));
		
		return e;
	}
	
	

}
