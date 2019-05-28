package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.EmployeeService;

public class JdbcTemplateTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=null;
		EmployeeService service=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean
		service=ctx.getBean("empService",EmployeeService.class);
		//invoke method
		System.out.println("Emps Count::"+service.fetchEmpsCount());
		//Emp Salary...
		/*System.out.println("Emp Salary::"+service.fetchEmpSalary(7499));
	   //Emp Details by No
		System.out.println("Emp Details::"+service.fetchEmpDetailsByNo(7499));
		//Emp Details by Desg
		System.out.println("Emp Details::"+service.listEmpDetailsByDesg("CLERK"));
		*/
		
		//System.out.println(service.registerEmp(1001, "rajesh","PRGMR"));
		//invoke method
		//System.out.println(service.hikeEmpSalaryByNo(7499,10));
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
