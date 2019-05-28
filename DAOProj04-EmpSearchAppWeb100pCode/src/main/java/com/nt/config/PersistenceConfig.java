package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	
	/*@Bean
	public JndiObjectFactoryBean createJOFB(){
		JndiObjectFactoryBean jofb=null;
		jofb=new JndiObjectFactoryBean();
		jofb.setJndiName("java:/comp/env/DsJndi");
		return jofb;
		
	}
	
	@Bean
	public DataSource createDataSource(){
        return (DataSource) createJOFB().getObject();		
	}*/
	
	@Bean
	public DataSource  createDataSource(){
		JndiDataSourceLookup jdsl=null;
		DataSource ds=null;
		jdsl=new JndiDataSourceLookup();
		ds=jdsl.getDataSource("java:/comp/env/DsJndi");
		return ds;
	}
	
	/*@Bean(name="template")
	public JdbcTemplate createJdbcTemplate(){
		return new JdbcTemplate(createDataSource());
		
	}*/
	
	@Bean(name="template",autowire=Autowire.BY_TYPE)
	public JdbcTemplate createJdbcTemplate(){
		return new JdbcTemplate();
		
	}
	

}







