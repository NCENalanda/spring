package com.nt.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

import com.nt.service.BankService;

@Configuration
@EnableTransactionManagement
public class AOPConfig {
	@Autowired
	 private DataSource ds;
	
	@Bean(name="dsTxMgmr")
	public  DataSourceTransactionManager   createDSTxMgmr(){
		return new DataSourceTransactionManager(ds);
	}
	
}
