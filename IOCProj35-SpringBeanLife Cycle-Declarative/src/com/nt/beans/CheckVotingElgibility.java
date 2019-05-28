package com.nt.beans;

import java.util.Date;

public class CheckVotingElgibility {
	private String name;
	private int age;
	private Date dov;
	
	public CheckVotingElgibility() {
		System.out.println("CheckVotingElgibility.0-param constructor");
	}
	
	public void setName(String name) {
		System.out.println("CheckVotingElgibity:setName(-)");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("CheckVotingElgibity:setAge(-)");
		this.age = age;
	}
	
	public void myInit(){
		dov=new Date();
		System.out.println("CheckVotingElgibity:myInit()");
		if(age<=0 || age>=150)
			throw new IllegalArgumentException("Invalid inputs (age must be in the range 1 through 149)");
	}
	
  public void myDestroy(){
		System.out.println("CheckVotingElgibity:myDestroy()");
		name=null;
		age=0;
		dov=null;
  }
	
	
	public String  checkElgibility(){
		System.out.println("Voter details::"+name+" "+age+"  "+dov);
		if(age>=18)
			return "Mr/Miss/Mrs. "+name+" u  r elgible to vote";
		else
			return "Mr/Miss/Mrs. "+name+" u  r not elgible to vote";
	}//method
}//class
