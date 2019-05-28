package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("cve")
public class CheckVotingElgibility {
	@Value("raja")
	private String name;
	@Value("30")
	private int age;
	private Date dov;
	
	@PostConstruct
	public void myInit(){
		System.out.println("CVE:myInit()");
		//post priocessing
		dov=new Date();
		//Verification
		if(name==null || age<=0)
			throw new IllegalArgumentException("provide Valid name,age values");
		
	}
	
	@PreDestroy
	public void myDestroy(){
		System.out.println("CVE:myDestroy()");
		dov=null;
		name=null;
		age=0;
	}
	
	
	public String checkVotingElgibilty(){
		if(age<18)
			return  "Mr/Miss. "+name+" u  r not elgigle  to vote-->dov:::"+dov;
		else
			return  "Mr/Miss. "+name+" u  r  elgigle  to vote-->dov::"+dov;
	}

}
