package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

import com.nt.config.AppConfig;
import com.nt.service.EmployeeService;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@Import(value=AppConfig.class)
public class BootApp3LayeredApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		ctx=SpringApplication.run(BootApp3LayeredApplication.class, args);
		//get Bean Servie class object
		service=ctx.getBean("empService",EmployeeService.class);
       try{
		//invoke method
		System.out.println("Emp Count ::"+service.fetchEmpsCount());
       }
       catch(Exception e){
    	   System.out.println("Internal problem ---Try again");
       }
       //close container
       ((ConfigurableApplicationContext) ctx).close();
		
	}
}
