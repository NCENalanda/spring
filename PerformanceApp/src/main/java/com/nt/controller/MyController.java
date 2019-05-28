package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.beans.User;
import com.nt.service.Addition;

import sun.misc.Request;

@Controller
public class MyController {
	@Autowired
	Addition add;
	
	@RequestMapping("/home")
	public String  goHome(Map<String,Object> model) {
		return "home" ;
	}
	@RequestMapping("/add")
	public String  goAdd(Map<String,Object> model) {
		return "add" ;
	}
	@RequestMapping("/res")
	public String  goResult(Map<String,Object> model , @ModelAttribute("u")User u) {
		
		int c=add.sum(u.getA(), u.getB());
	   model.put("fv", c);
		
		return "res" ;
	}

}
