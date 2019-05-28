package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 @Component("voter")
public class CheckVotingElgibility {
	 @Value("raja")
	private String name;
	 @Value("-30")
	private int age;
	 
	 //custom init method (Using annotations)
	 @PostConstruct
	 public void  myInit(){
		 if(age<=0)
			 throw new IllegalArgumentException("Invalid age");
	 }
	 
	 @PreDestroy
	 public void myDestroy(){
		 name=null;
		 age=0;
	 }
	 
	 public  String checkVotingElgibility(){
		 if(age<18)
			 return "Mr./Miss./Mrs. "+name+" u r not elgible to vote";
		 else
			 return "Mr./Miss./Mrs. "+name+" u r  elgible to vote";
	 }
}
