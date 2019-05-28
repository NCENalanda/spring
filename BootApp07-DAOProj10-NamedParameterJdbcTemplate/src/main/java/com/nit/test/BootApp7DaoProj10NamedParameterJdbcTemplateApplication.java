package com.nit.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.dto.DepartmentDTO;
import com.nt.service.DepartmentService;

@SpringBootApplication
@Import(AppConfig.class)
public class BootApp7DaoProj10NamedParameterJdbcTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		DepartmentService service=null;
		List<DepartmentDTO> listDTO=null;
		ctx=SpringApplication.run(BootApp7DaoProj10NamedParameterJdbcTemplateApplication.class, args);
		//get Bean
		service=ctx.getBean("deptService",DepartmentService.class);
		//invoke method
		listDTO=service.searchDeptsByDeptNos(10,20);
		System.out.println("Depts are:::");
		listDTO.forEach(dto->{
			System.out.println(dto.getDeptNo()+"  "+dto.getDeptName()+" "+dto.getLocation());
		});
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
