package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.bpp.PersonBOPostProcessor;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.CollegeService;

public class MainControllerServlet extends HttpServlet {
	 ApplicationContext ctx=null;
	 CollegeService service=null;
	 BeanFactory factory=null;
	@Override
	public void init() throws ServletException {
		try{
		//create IOC container
	   //ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));	
	    ((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(new PersonBOPostProcessor());
		//get BEan
	   //service=ctx.getBean("service",CollegeService.class);
		service=factory.getBean("service",CollegeService.class);
		}
		catch(Exception e){
			 e.printStackTrace();
		}
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String pval=null;
		String resultMsg=null; 
		StudentDTO stDTO=null;
		EmployeeDTO empDTO=null;
		RequestDispatcher rd=null;
		//read s1 req param value
		pval=req.getParameter("s1");
		if(pval.equalsIgnoreCase("registerStudent")){
			 //read form data
			stDTO=new StudentDTO();
			stDTO.setPid(Integer.parseInt(req.getParameter("sid")));
			stDTO.setCourse(req.getParameter("course"));
			stDTO.setPname(req.getParameter("sname"));
			//use service class
			resultMsg=service.processStudent(stDTO);
			//keep result in request scope
			req.setAttribute("resultMsg",resultMsg);
			//forward req to jsp page
			rd=req.getRequestDispatcher("/result.jsp");
			rd.forward(req,res);
		}
		else{
			 //read form data
			empDTO=new EmployeeDTO();
			empDTO.setPid(Integer.parseInt(req.getParameter("eid")));
			empDTO.setDesg(req.getParameter("desg"));
			empDTO.setPname(req.getParameter("ename"));
			//use service class
			resultMsg=service.processEmployee(empDTO);
			//keep result in request scope
			req.setAttribute("resultMsg",resultMsg);
			//forward req to jsp page
			rd=req.getRequestDispatcher("/result.jsp");
			rd.forward(req,res);
		}
	}//doGet(-,-)
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    doGet(req,res);
	}//doPost(-,-)
}
