package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckVotingElgibility implements InitializingBean,DisposableBean{
	private String name;
	private String addrs;
	private int age;
	
	public CheckVotingElgibility() {
		System.out.println("CVE:0-param constructor");
	}
	
		public void setName(String name) {
			System.out.println("CVE:setName(-)");
		this.name = name;
	}
	
	public void setAddrs(String addrs) {
		System.out.println("CVE:setAddrs(-)");
		this.addrs = addrs;
	}


	public void setAge(int age) {
		System.out.println("CVE:setAge(-)");
		this.age = age;
	}
	
	public void myInit(){
		System.out.println("CVE:myInit()");
		if(name==null || age<=0)
			throw new IllegalArgumentException("provide valid inputs");
	}
	
	public String  checkVotingElgibility(){
		System.out.println("CVE:checkVotingElgibility()");
	    if(age>=18)
	    	return "Mr/Miss/Mrs."+name+" u r elgible for voting";
	    else
	    	return "Mr/Miss/Mrs."+name+" u r not elgible for voting";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("CVE:destroy()");
		name=null;
		age=0;
		addrs=null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CVE:afterPropertiesSet(-) method");
		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid inputs");
		
	}
	
	public void myDestroy(){
		System.out.println("CVE:myDestroy()");
		name=null;
		age=0;
		addrs=null;
	}

	}
