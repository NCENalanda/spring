package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.vo.EmployeeVO;

public class LayeredAppTest {

	public static void main(String[] args) {
		Scanner sc=null;
		String eno=null,ename=null,addrs=null,company=null,basicSalary=null;
		EmployeeVO vo=null;
		ApplicationContext ctx=null;
		String result=null;
		EmployeeController controller=null;
		
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("Enter EmployeeID::");
		eno=sc.next();
		System.out.println("enter Employee name::");
		ename=sc.next();
		System.out.println("enter Employee Addrs::");
		addrs=sc.next();
		System.out.println("enter Employee Company::");
		company=sc.next();
		System.out.println("enter Employee BasicSalary::");
		basicSalary=sc.next();
		//store Inputs into EmpoyeeVO class object
		vo=new EmployeeVO();
		vo.setEno(eno); vo.setEname(ename); vo.setAddress(addrs);
		vo.setCompany(company); vo.setBasicSalary(basicSalary);
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Controller class obj
		controller=ctx.getBean("empController",EmployeeController.class);
		try{
		//invoke method
			result=controller.processEmployee(vo);
			System.out.println("Client::"+result);
		}
		catch(Exception e){
			System.out.println("Internal Problem..Try Again ???-->"+e.getMessage());
		}
	}//main
}//class
