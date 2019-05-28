package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageGenretorController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String wishMsg=null;
		Calendar cal=Calendar.getInstance();
		int hours=cal.get(cal.HOUR_OF_DAY);
		if(hours<12)
			wishMsg="GoodMorning";
		if(hours<16)
			wishMsg="GoodAfternoon";
		if(hours<20)
			wishMsg="GoodEvening";
		else
			wishMsg="GoogNinght";
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("show_msg");
		mav.addObject("res", wishMsg);
		return mav;
	}

}
