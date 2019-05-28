package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowTilePagesController {
	
	@RequestMapping("/home.htm")
	public String showHome(){
		return  "homeDef";
	}
	
	@RequestMapping("/link1.htm")
	public String showPage1(){
		return "page1Def";
		
	}
	
	@RequestMapping("/link2.htm")
	public String showPage2(){
		return "page2Def";
		
	}
	
	@RequestMapping("/link3.htm")
	public String showPage3(){
		return "page3Def";
	}

}
