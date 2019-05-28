package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wg")
public class WishGenerator {
	@Autowired
	private Calendar calendar;
	
	
	public  String generateWishMessage(String uname){
		int hour=0;
		//Get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		//generate wish messages
		if(hour<=12)
			return "GM:"+uname;
		else if(hour<=16)
			return "GA:"+uname;
		else if(hour<=20)
			return "GE:"+uname;
		else
			return "GN:"+uname;
	}
}
