package com.nt.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.service.SysDateGenerator;
import com.nt.service.SysPropsGenerator;

public class FrontControllerServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		   SysDateGenerator  dateGenerator=null;
		   Date sysDate=null;
		   SysPropsGenerator propsGenerator=null;
		   Properties props=null;
		   RequestDispatcher rd=null;
		//Delegate the requests to service classes based on virtual paths of request urls
		if(req.getServletPath().equalsIgnoreCase("/s1.do")){
			dateGenerator=new SysDateGenerator();
			sysDate=dateGenerator.getSysDate();
			//keep result in request scope
			req.setAttribute("result", sysDate);
		}
		else if(req.getServletPath().equalsIgnoreCase("/s2.do")){
			propsGenerator=new SysPropsGenerator();
		   props=propsGenerator.getSysProperties();
			//keep result in request scope
			req.setAttribute("result", props);
		}
		
		//Delegate or Forward the request to jsp page
		 if(req.getServletPath().equalsIgnoreCase("/s1.do")){
			 rd=req.getRequestDispatcher("/show_date.jsp");
			 rd.forward(req,res);
		 }
		 else if(req.getServletPath().equalsIgnoreCase("/s2.do")){
                rd=req.getRequestDispatcher("/show_sysprops.jsp");
                rd.forward(req,res);
		 }
		
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 doGet(req,res);
	}

}
