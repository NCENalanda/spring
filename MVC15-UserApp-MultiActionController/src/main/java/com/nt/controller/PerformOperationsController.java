package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.UserCommand;

public class PerformOperationsController extends MultiActionController {

	public ModelAndView add(HttpServletRequest req, HttpServletResponse res, UserCommand cmd) {
	   System.out.println(cmd);
		return new ModelAndView("user", "operation", "insert operation");
	}

	public ModelAndView update(HttpServletRequest req, HttpServletResponse res, UserCommand cmd) {
		return new ModelAndView("user", "operation", "update operation");
	}

	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res, UserCommand cmd) {
		return new ModelAndView("user", "operation", "delete operation");
	}

	public ModelAndView view(HttpServletRequest req, HttpServletResponse res, UserCommand cmd) {
		return new ModelAndView("user", "operation", "view operation");
	}
	
	public ModelAndView invalid(HttpServletRequest req, HttpServletResponse res, UserCommand cmd) {
		return new ModelAndView("user", "operation", "invalid operation");
	}
	

}
