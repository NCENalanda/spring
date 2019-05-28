package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class SJInsertTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService service=null;
		StudentDTO dto=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Service class obj
		service=ctx.getBean("stService",StudentService.class);
		//invoke method
		dto=new StudentDTO();
		dto.setSno(5458);
		dto.setSname("rajesh");
		dto.setSadd("hyd");
		System.out.println(service.register(dto));
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//method
}//class
