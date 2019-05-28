package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.EmpSearchService;

public class EmpSearchControllerServlet extends HttpServlet {
	 ApplicationContext ctx=null;
	public  void init(){
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String desg[]=null;
		EmpSearchService service=null;
		List<Map<String,Object>> list=null;
		RequestDispatcher  rd=null;
         //read form data
		desg=req.getParameterValues("desgs");
		//get Service class object
		service=ctx.getBean("empService",EmpSearchService.class);
		try{
		//invoke method
		list=service.searchEmpsByDesgs(desg);
		//keep result in request scope
		req.setAttribute("listEmps",list);
		//forward request
		rd=req.getRequestDispatcher("/result.jsp");
		rd.forward(req,res);
		}
		catch(DataAccessException dae){
			dae.printStackTrace();
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
			
		}
		catch(Exception e){
			e.printStackTrace();
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
		}
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req, res);
	}//doPost(-,-)
	
	@Override
	public void destroy() {
		
	   ((AbstractApplicationContext) ctx).close();
	}
	
}//class
