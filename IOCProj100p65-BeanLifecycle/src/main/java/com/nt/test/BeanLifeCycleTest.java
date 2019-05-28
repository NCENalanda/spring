package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.CheckVotingElgibility;
import com.nt.config.AppConfig;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CheckVotingElgibility voter=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean
		voter=ctx.getBean("voter",CheckVotingElgibility.class);
		System.out.println(voter.checkVotingElgibility());
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
