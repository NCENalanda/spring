package com.nt.beans;

import java.util.Date;

//Target class
public class WishGenerator {
	static{
		System.out.println("WishGenerator:static block");
	}
	
	//bean property/member variable/ attribute
	private  Date date;
	
	public WishGenerator(Date dat) {
		System.out.println("WishGenerator:1-param constructor");
		this.date=dat;
	}
	public void setDate(Date date){
		System.out.println("WishGenerator:setDate(-)");
		this.date=date;
	}
	
	//B.method having b.logic...
	public String   generateWishMessage(String user){
		System.out.println("WishGenerator::generateWishMessage(-) date=="+date);
		int hour=0;
		//	get Current hour from System Date 
		hour=date.getHours(); //24 hours format
		//generate wish Message
		if(hour<=12)
			 return "GM::"+user;
		else if(hour<=16)
			return "GA::"+user;
		else if(hour<=20)
			return "GE::"+user;
		else 
			return "GN::"+user;
	}//method
}//class
