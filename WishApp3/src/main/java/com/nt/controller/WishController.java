package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.GenerateWishMessage;

@Controller
//@RequestMapping(value="/*")
public class WishController {
	public WishController() {
		// TODO Auto-generated constructor stub
		System.out.println("0 Param Constructor      WishController()");
	}
	@Autowired
	private GenerateWishMessage gwm;
	
	@RequestMapping("/welcome.htm")
	public String welcome(Map<String, Object> model) {
		return "welcome";
	}
	
	@RequestMapping("/wish.htm")
	public String getWishMessage(Model  model) {
		String msg=null;
		msg=gwm.generateWishMessage();
		model.addAttribute("Message", msg);
		return "wish";
	}

}
