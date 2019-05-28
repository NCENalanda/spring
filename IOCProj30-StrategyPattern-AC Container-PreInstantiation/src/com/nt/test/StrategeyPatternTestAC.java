package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.JobSeeker;

public class StrategeyPatternTestAC {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 JobSeeker seeker=null;
		 //create IOC container
		// ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		 //ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get Bean
		/* seeker=ctx.getBean("seeker",JobSeeker.class);
		 System.out.println(seeker.applyJob("HCL"));
		 */
		 System.out.println("....");
		 //close container
		 ((AbstractApplicationContext) ctx).close();
		 
	   }
	}