package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.BankLoanApprover;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankLoanApprover proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",BankLoanApprover.class);
		try{
		// invoke b.method
		System.out.println("Status:::"+proxy.approveLoan(1001, "agri", "jani bhasha"));
		System.out.println(".............................................");
		System.out.println("Status:::"+proxy.approveLoan(1002, "holiday", ""));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
