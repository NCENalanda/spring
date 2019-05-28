package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.service.Wish_Generate_Message;



@Controller
public class WishController {
	
	@Autowired
	private Wish_Generate_Message service;
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String goHome() {
		
		return "home";
	}

}
