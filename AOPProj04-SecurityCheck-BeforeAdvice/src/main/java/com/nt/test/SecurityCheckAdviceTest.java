package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.aspect.AuthenticationManager;
import com.nt.service.BankService;

public class SecurityCheckAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationManager manager=null;
		BankService proxy=null;
	//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bEan
		manager=ctx.getBean("authManager",AuthenticationManager.class);
		//signIn
		manager.singnIn("raja","rani");
		//get Proxy object
		proxy=ctx.getBean("pfb",BankService.class);
		try{
		System.out.println("withDraw??"+proxy.withdraw(1001,2000));
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("---------------------------------------");
		try{
			System.out.println("Deposite??"+proxy.deposite(1001, 4000));
			}
			catch(Exception e){
				System.out.println(e);
			}
		
		
		
		//signout
		manager.signOut();
		//close container
		((AbstractApplicationContext) ctx).close();
	}
}
