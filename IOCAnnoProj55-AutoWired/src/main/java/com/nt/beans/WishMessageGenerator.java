package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {
	/*@Autowired(required=true)
	//@Qualifier(value="dt1")
	//@Qualifier("java.util.Date#1")
	@Qualifier("d1")*/
	private Date date;
	
	@Autowired(required=false)
	private WishMessageGenerator(@Qualifier("dt1") Date date) {
	   System.out.println("WMG:1-param constructor");
		this.date =date;
	}
	
	
   
   
  




	/*@Autowired
	@Qualifier("d1")
	private void setDate(Date date){
		System.out.println("WMG:setDate(-)");
		this.date=date;
	}*/
	
	/*@Autowired
	@Qualifier("d1")
	private  void assign(Date date){
		System.out.println("WMG:assign(-)");
		this.date=date;
	}*/
	
	public String generateWishMessage(String uname){
		System.out.println("date::"+date);
		return "Good Morning::"+uname;
	}

}
