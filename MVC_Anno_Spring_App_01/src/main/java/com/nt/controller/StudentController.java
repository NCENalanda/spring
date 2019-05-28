package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	public StudentController() {
		// TODO Auto-generated constructor stub
		System.out.println("StudentController.StudentController()");
	}
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET  )
	public String goHome() {
		
		return "home";
	}
}
