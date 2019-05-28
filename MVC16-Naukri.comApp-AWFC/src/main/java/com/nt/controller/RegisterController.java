package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

public class RegisterController  extends AbstractWizardFormController {

	@Override
	public ModelAndView processFinish(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException be) throws Exception {
		System.out.println("pricessFinish(-,-,-,-)");
	  ModelAndView mav=null;
	  mav=new ModelAndView();
	  mav.setViewName("result");
	  mav.addObject("cmdData",cmd);
		return mav;
	}
	
	@Override
	public ModelAndView processCancel(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException be) throws Exception {
		System.out.println("pricessCancel(-,-,-,-)");
		return new ModelAndView("welcome");
	}
	
	

}
