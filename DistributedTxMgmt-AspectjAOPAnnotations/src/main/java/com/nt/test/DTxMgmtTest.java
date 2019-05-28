package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class DTxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService  proxy=null;
		//create IOC container
			ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
			//get Proxy object
			proxy=ctx.getBean("bankService",BankService.class);
			try{
				System.out.println("TransferMoney??"+proxy.transferMoney(1002, 1023, 10000));
				System.out.println("DTX Committed--->Money Transffered");
			}
			catch(Exception e){
				e.printStackTrace();
				System.out.println("DTx  rolledBack and Money not transffered");
			}
			
			//close container
			((AbstractApplicationContext) ctx).close();
	}//main
}//class
