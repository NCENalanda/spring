package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

public class SpringAOPTxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService  proxy=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Proxy object
		proxy=ctx.getBean("bankService",BankService.class);
		try{
		//invoke method..
		System.out.println("Money Transffered?"+proxy.transferMoney(1001,10024,200));
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
