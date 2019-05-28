package com.nt.interceptor;

import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DoublePostingPreventingInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		HttpSession ses=null;
		int cTkn=0,sTkn=0;
		RequestDispatcher rd=null;
		//get Session
		ses=req.getSession();
		//generate Session token while launching the  form page
		if(req.getMethod().equals("GET")){
			 ses.setAttribute("sToken",new Random().nextInt(10000));
			 return true;
		}
		else		{
			//get Client side and server side tokens
			cTkn=Integer.parseInt(req.getParameter("cToken"));
			sTkn=(Integer)ses.getAttribute("sToken");
			if(cTkn==sTkn){
				//change server side token value..
				ses.setAttribute("sToken",new Random().nextInt(100000));
				return true;
			}
			else{
				rd=req.getRequestDispatcher("/dbl_post.jsp");
				rd.forward(req,res);
				return false;
			}
			
		}
		
	}
	
	
}
