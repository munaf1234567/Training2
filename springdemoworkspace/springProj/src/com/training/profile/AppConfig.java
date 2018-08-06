package com.training.profile;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;


//@ComponentScan(basePackages= {"com.training.profile"})
//@Import(proddatabaseConfic.class)
@ComponentScan(basePackages= {"com.training.profile"})
@Configuration

public class AppConfig {
	public AppConfig()
	{
		System.out.println("AppConfig---dc");
	}
	
	   @Autowired
	  DataSource  dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
