package com.nt.beans;

import java.util.Date;

public class ScheduleRemainder {
	private  Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String remainder1(){
		System.out.println(date);
		  if(date.compareTo(new Date())==0)
			  return "Remainder to complete task1 today itself";
		  else if(date.compareTo(new Date())>0)
			  return "Remainder to complete task1 in "+(date.getTime()-new Date().getTime())/(1000*60*60*24)+" days";
		  else
			  return " task completed"; 
		  } //method
	}//class
