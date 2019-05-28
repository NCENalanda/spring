package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.IntrestAmountCalculator;

public class PropertyEditorTest_AC {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrestAmountCalculator iac=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean class obj
		iac=ctx.getBean("iac",IntrestAmountCalculator.class);
		//invoke method
		System.out.println("Intrest Amount:::"+iac.calcIntrestAmount());
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}
}
