package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class EmployeeController extends SimpleFormController {
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		ModelAndView mav=null;
		
		mav=new ModelAndView();
		mav.setViewName(getSuccessView());
		mav.addObject("cmdData", command);
		return mav;
	}
	
	@Override
	public void initBinder(HttpServletRequest req, ServletRequestDataBinder binder) throws Exception {
		System.out.println("EmployeeController:: initBinder(-,-)");
	    SimpleDateFormat sdf=null;
		//Specify Input Date pattern
	    sdf=new SimpleDateFormat("dd-MM-yyyy");
	  //register DatePropertyEditor with binder object.
	    binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
		
	}
	
}
