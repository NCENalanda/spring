package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BillAmountCalculator;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BillAmountCalculator proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",BillAmountCalculator.class);
		try{
		//invoke method
		System.out.println("Bill Amount:::"+proxy.calcBillAmount(0,0));
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println(".........................................");
		try{
			//invoke method
			System.out.println("Bill Amount:::"+proxy.calcBillAmount(10,20));
			}
			catch(Exception ex){
				System.out.println(ex.toString());
			}
		
//close IOC container
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
