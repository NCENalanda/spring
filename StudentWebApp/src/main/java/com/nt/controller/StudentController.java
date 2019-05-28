package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.model.Student;
@ Controller
public class StudentController {
	@RequestMapping("/home.htm")
	public String goHome(Map <String, Object> model) {
		return "home";
	}
	@RequestMapping("/signup.htm")
	public String goSinUp(Map <String, Object> model) {
		return "signup";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveInfo(Map <String, Object> model, @ModelAttribute("st") Student student, BindingResult errors) {
		return "sucessful";
	}
}
