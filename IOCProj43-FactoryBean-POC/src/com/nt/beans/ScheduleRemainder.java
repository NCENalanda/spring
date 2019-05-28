package com.nt.beans;

import java.util.Date;

public class ScheduleRemainder {
	private Date date;

	public ScheduleRemainder(Date date) {
		System.out.println("SecheduleRemainder:: 1-param constructor"+date);
		this.date = date;
		
	}
	
	public String   remainder(){
		Date sysDate=new Date();
	    if((sysDate.getYear()==date.getYear()) &&(sysDate.getMonth()==date.getMonth()) && (sysDate.getDate()==date.getDate())) 
	             return "Its been one 1 year coming to ameerpet,still eating parent money , Shame on u ";
	    else
	    	return "No Remainder for To day";
	}
}
