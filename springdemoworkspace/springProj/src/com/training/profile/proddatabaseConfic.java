package com.training.profile;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
//@Component
@Profile("Production")
public class proddatabaseConfic implements DatabseConfig {
	public proddatabaseConfic()
	{
		System.out.println("proddatabaseConfic---dc");
	}

	@Bean
	public DataSource createDatasource() {
		System.out.println("createDatasource---proddatabaseConfic");
		System.out.println("createing prod db ins");
		DriverManagerDataSource ds= new DriverManagerDataSource();
		
		return ds;
	}

}
