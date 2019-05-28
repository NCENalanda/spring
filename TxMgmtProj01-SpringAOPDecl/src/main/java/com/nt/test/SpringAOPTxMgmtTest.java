package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class SpringAOPTxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService  proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("tpfb",BankService.class);
		try{
		//invoke method..
		System.out.println("Money Transffered?"+proxy.transferMoney(1002,10033,1000));
		System.out.println("Transaction Committed and Money Transffered");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Transaction Rolled back and Money not  Transffered");
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
