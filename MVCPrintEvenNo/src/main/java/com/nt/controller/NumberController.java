package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.EvenNo;
import com.nt.service.OddNo;

public class NumberController extends AbstractController {
	private EvenNo even;
	public NumberController(EvenNo even) {
		super();
		this.even = even;	
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		List<Number> al=null;
		ModelAndView mav=null;
	
		al=even.genreateEven();
		mav=new ModelAndView();
		mav.setViewName("number");
		mav.addObject("num", al);
		return mav;
	}

}
