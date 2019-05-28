package com.nt.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.LoanApprover;

public class BeforeAdviceAuditingTestCases {
	private static ApplicationContext ctx=null;
	private static LoanApprover proxy=null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAdviceAuditingTestCases.setUpBeforeClass()");
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		proxy=ctx.getBean("approver",LoanApprover.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("BeforeAdviceAuditingTestCases.tearDownAfterClass()");
		proxy=null;
		((AbstractApplicationContext) ctx).close();
	}

	@Test
	public void testWithAgriLoan() {
		
		assertEquals("test1", "1001 loan  approved  by raja loan type isagri",proxy.approveLoan(1001,"agri","raja"));
	
	}
	
	@Test
	public void testWithNonAgriLoan() {
		
		assertEquals("test2", "1001 loan  rejected  by raja loan type isstudy",proxy.approveLoan(1001,"study","raja"));
	
	}


}
