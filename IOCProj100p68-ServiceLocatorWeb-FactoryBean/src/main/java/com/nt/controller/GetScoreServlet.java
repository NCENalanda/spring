package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.CrickBuzzGetScoreService;

public class GetScoreServlet extends HttpServlet {
	CrickBuzzGetScoreService localService=null;
	ApplicationContext ctx=null;
	public void init(){
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get LocalService object
		localService=ctx.getBean("cbzService",CrickBuzzGetScoreService.class);
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
         int mid=0;
         String scoreCard=null;
         RequestDispatcher rd=null;
		//read match id from hyperlinks
         mid=Integer.parseInt(req.getParameter("mid"));
         //use LocalService
         scoreCard=localService.getScore(mid);
         //keep ScoreCard in request scope
         req.setAttribute("scoreBoard",scoreCard);
         //get RequestDispatcher  object
         rd=req.getRequestDispatcher("/score_board.jsp");
         rd.forward(req,res);
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      doGet(req,res);
	}//doPost(-,-)

}//class
