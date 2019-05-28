package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CrickBuzzFindScoreService;

public class CrickBuzzMainControllerServlet extends HttpServlet {
	ApplicationContext ctx=null;
	 @Override
	public void init() throws ServletException {
	  //create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CrickBuzzFindScoreService service;
		int mid=0;
		String scoreCard=null;
		RequestDispatcher rd=null;
		//get Service class obj
		service=ctx.getBean("cbService",CrickBuzzFindScoreService.class);
		//read mid from hyperlinks
		mid=Integer.parseInt(req.getParameter("mid"));
		//invoke service method
		scoreCard=service.findScore(mid);
		//keep scoreCard in reequest Scope
		req.setAttribute("score",scoreCard);
		//forward to show_score.jsp
		rd=req.getRequestDispatcher("/show_score.jsp");
		rd.forward(req, res);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
	@Override
	public void destroy() {
	((AbstractApplicationContext) ctx).close();
	}

}
