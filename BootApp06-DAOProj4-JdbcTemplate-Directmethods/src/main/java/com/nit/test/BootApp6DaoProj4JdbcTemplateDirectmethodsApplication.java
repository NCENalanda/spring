package com.nit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.service.EmployeeService;

@SpringBootApplication
@Import(value=AppConfig.class)
public class BootApp6DaoProj4JdbcTemplateDirectmethodsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		ctx=SpringApplication.run(BootApp6DaoProj4JdbcTemplateDirectmethodsApplication.class, args);
		//get SErvice class object
		service=ctx.getBean("empService",EmployeeService.class);
		//invoke method
		System.out.println("Emp count::"+service.fetchEmpsCount());
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
		
	}
}
