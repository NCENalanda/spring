package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CheckVotingElgibility;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CheckVotingElgibility voting=null,voting1=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		voting=ctx.getBean("cve",CheckVotingElgibility.class);
		//invoke b.method
		System.out.println(voting.checkVotingElgibility());
		
		//close container
		((AbstractApplicationContext) ctx).close();
		//((AbstractApplicationContext) ctx).stop();
		voting1=ctx.getBean("cve",CheckVotingElgibility.class);
       System.out.println(voting.hashCode()+" "+voting1.hashCode());
	}

}
