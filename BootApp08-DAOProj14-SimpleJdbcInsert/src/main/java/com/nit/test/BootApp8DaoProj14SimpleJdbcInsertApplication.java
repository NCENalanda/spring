package com.nit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

@SpringBootApplication
@Import(value=AppConfig.class)
public class BootApp8DaoProj14SimpleJdbcInsertApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService service=null;
		StudentDTO dto=null;
		ctx=SpringApplication.run(BootApp8DaoProj14SimpleJdbcInsertApplication.class, args);
		//get Service class obj
				service=ctx.getBean("stService",StudentService.class);
				//invoke method
				dto=new StudentDTO();
				dto.setSno(2267);
				dto.setSname("rajesh");
				dto.setSadd("hyd");
				System.out.println(service.register(dto));
				//close IOC container
				((AbstractApplicationContext) ctx).close();
	}//main
}//class
