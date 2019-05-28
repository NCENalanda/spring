package com.nt.interceptors;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeCheckInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		Calendar calendar=null;
		int hour=0;
		RequestDispatcher rd=null;
		System.out.println(req.getServletPath());
		if(!req.getServletPath().equals("/nareshit/spring/welcome")){
		//get System Date
		calendar=Calendar.getInstance();
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<9 || hour>17){
			rd=req.getRequestDispatcher("/timeout.jsp");
			rd.forward(req, res);
			return false;
		}
		else{
			return true;
	    	}
		}
		else{
			return true;
		}
	}//method
}//class
