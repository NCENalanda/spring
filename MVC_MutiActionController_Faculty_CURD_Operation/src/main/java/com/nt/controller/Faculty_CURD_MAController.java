package com.nt.controller;

import javax.management.AttributeValueExp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.FacultyCommand;

public class Faculty_CURD_MAController extends MultiActionController {
	
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res,FacultyCommand cmd) {
		
		ModelAndView mav=null;
		String msg=null;
		mav=new ModelAndView();
		msg="Successful insert";
		mav.addObject("str",msg);
		mav.addObject("faCmd", cmd);
		mav.setViewName("faculty_register");
		System.out.println(cmd.toString());
		return mav;	
	}
	
public ModelAndView update(HttpServletRequest req,HttpServletResponse res,FacultyCommand cmd) {
		
		ModelAndView mav=null;
		String msg=null;
		mav=new ModelAndView();
		msg="Successful update";
		mav.addObject("str",msg);
		mav.addObject("faCmd", cmd);
		mav.setViewName("faculty_register");
		System.out.println(cmd.toString());
		return mav;
		
	}

public ModelAndView delete(HttpServletRequest req,HttpServletResponse res,FacultyCommand cmd) {
	
	ModelAndView mav=null;
	String msg=null;
	mav=new ModelAndView();
	msg="Successful delete";
	mav.addObject("str",msg);
	mav.addObject("faCmd", cmd);
	mav.setViewName("faculty_register");
	System.out.println(cmd.toString());
	return mav;
	
    }


public ModelAndView find(HttpServletRequest req,HttpServletResponse res,FacultyCommand cmd) {
	
	ModelAndView mav=null;
	String msg=null;
	mav=new ModelAndView();
	msg="Successful find";
	mav.addObject("str",msg);
	mav.addObject("faCmd", cmd);
	mav.setViewName("faculty_register");
	System.out.println(cmd.toString());
	return mav;
	
    }
      
     
   


}
