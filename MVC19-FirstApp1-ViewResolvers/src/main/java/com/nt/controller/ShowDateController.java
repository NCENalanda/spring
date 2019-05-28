package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ShowDateController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return new ModelAndView("result","sysDate",new Date());
	}

}
