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

public class MainControllerServlet extends HttpServlet {
    ApplicationContext ctx=null;
	public void init(){
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int mid=0;
		CrickBuzzFindScoreService localService=null;
		String scoreBoard=null;
		RequestDispatcher rd=null;
		//read match id from hyperlinks
		mid=Integer.parseInt(req.getParameter("mid"));
		//get LocalService class obj
		localService=ctx.getBean("cbService",CrickBuzzFindScoreService.class);
		//use Local Service
		try{
		 scoreBoard=localService.findScore(mid);
		}
		catch(IllegalStateException ise){
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
			return;
		}
		catch (Exception e) {
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
			return;
		}
		 //keep the Score in request scope
		 req.setAttribute("scoreBoard",scoreBoard);
		 //forward to view_score.jsp
		 rd=req.getRequestDispatcher("/view_score.jsp");
		 rd.forward(req,res);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  doGet(req, res);
	}
	
	 @Override
	public void destroy() {
		 ((AbstractApplicationContext) ctx).close();
	}
	
}
