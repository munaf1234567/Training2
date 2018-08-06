package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@Profile("Development")
public class devdatabaseConfic implements DatabseConfig {

	
	public devdatabaseConfic()
	{
		System.out.println("devdatabaseConfic---dc");
	}
       @Bean
	public DataSource createDatasource() {
		System.out.println("createing dev db ins");
		DriverManagerDataSource ds= new DriverManagerDataSource();
		
		return ds;
	}

}
