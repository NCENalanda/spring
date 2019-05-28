package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	public WishMessageGenerator(Date date1) {
		System.out.println("WishMessageGenerator:: 1-param constructor");
		this.date = date1;
	}
	
	public void setDate(Date date){
		System.out.println("WishMessageGenerator:: 1-param constructor");
		this.date=date;
	}
	
	public  String generateWishMessage(String user){
		   int hour=0;
		   System.out.println("date==="+date);
		   //get current Hour
		   hour=date.getHours(); // gives current hour of the day
		   //write WishMessage
		   if(hour<=12)
			   return "GM::"+user;
		   else if(hour<=16)
			    return "GA::"+user;
		   else if(hour<=20)
			    return "GE::"+user;
		   else
			   return "GN::"+user;
	}//method
	

}
