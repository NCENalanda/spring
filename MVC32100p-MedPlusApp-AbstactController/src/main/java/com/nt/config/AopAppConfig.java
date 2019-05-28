package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class AopAppConfig {
	@Autowired
	private DataSource ds;
	
	@Bean(name="dsTxMgmr")
	public DataSourceTransactionManager createDTxMgmr(){
		return new DataSourceTransactionManager(ds);
		
	}
	
	

}
