package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class CallbackInterfacesTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
		List<EmployeeDTO> listDTO=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("empService",EmployeeService.class);
		//invok method
		dto=service.findEmpDetialsByNo(7499);
		System.out.println("7499 Emp Detials"+dto.getEno()+"  "+dto.getEname()+"  "+dto.getSalary()+" "+dto.getDesg());
		System.out.println("CLERK Desg Emp Details");
		listDTO=service.findEmpDetailsByDesg("CLERK");
		listDTO.forEach(dt->{
			System.out.println(dt.getEno()+" "+dt.getEname()+" "+dt.getDesg()+" "+dt.getSalary());
		});
		
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
