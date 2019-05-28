package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageGeneratorController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String message=null;
		Calendar cal=null;
		int hour=0;
		//get SysDate
		cal=Calendar.getInstance();
		//get current hour 
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			message="Good Morning";
		else if (hour<16)
			message="Good Afternoon";
		else if(hour<20)
			message="Good Evening";
		else
			message="Good Night";
    return new ModelAndView("result","msg",message);
	}

}
