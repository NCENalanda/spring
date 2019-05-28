package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.LoanApprover;

public class BeforeAdviceAuditingTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		LoanApprover proxy=null;
		// create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		proxy=ctx.getBean("approver",LoanApprover.class);
		System.out.println(proxy.approveLoan(10001,"agri","raja"));
		
		//close the container
		((AbstractApplicationContext) ctx).close();
	}
}
