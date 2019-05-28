package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.config.AppConfig;
import com.nt.service.EmpSearchService;

@WebServlet(value="/controller",loadOnStartup=1)
public class EmpSearchControllerServlet extends HttpServlet {
	 ApplicationContext ctx=null;
	public  void init(){
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
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
		service=ctx.getBean("searchService",EmpSearchService.class);
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
