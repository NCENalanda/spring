package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishMessageGeneratorService;

public class WishMessageGeneratorController extends AbstractController {
	private  WishMessageGeneratorService service;

	public WishMessageGeneratorController(WishMessageGeneratorService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String message=null;
		ModelAndView mav=null;
		//use Service
		message=service.generateWishMessage();
		//create MAV object
		mav=new ModelAndView();
		mav.setViewName("result");
		mav.addObject("msg",message);
		return mav;
	}

}
