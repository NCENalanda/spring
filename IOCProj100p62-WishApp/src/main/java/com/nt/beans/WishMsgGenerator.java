package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("wish")
//@Scope("prototype")
@DependsOn("cal")
public class WishMsgGenerator {
	@Autowired
	private  Calendar calendar;
	
	public WishMsgGenerator() {
		System.out.println("WisgMsgGenerator:0-param constructor");
	}
	
	
	public String generateWishMessage(String user){
		int hour=0;
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		//generate wish message
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
