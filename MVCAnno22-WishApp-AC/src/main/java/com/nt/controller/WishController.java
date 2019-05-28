package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;
	
	/*@RequestMapping(value="/wish.htm")
	public ModelAndView  process(){
		String wMsg=null;
		//use Service
		wMsg=service.generateWishMessage();
		//return MAV
		return new ModelAndView("result","msg",wMsg);
	}*/
	
	/*@RequestMapping("/wish.htm")
	public  String process(Model model){
		String wMsg=null;
		//use Service
		wMsg=service.generateWishMessage();
		model.addAttribute("msg",wMsg);
		return "result";
	}
*/	
	/*@RequestMapping("/wish.htm")
	public  String process(ModelMap map){
		String wMsg=null;
		//use Service
		wMsg=service.generateWishMessage();
		map.put("msg", wMsg);
		return "result";
	}*/
	
	/*@RequestMapping("/wish.htm")  //best
	public  String process(Map map){
		String wMsg=null;
		//use Service
		wMsg=service.generateWishMessage();
		map.put("msg", wMsg);
		return "result";
	}*/
	
	/*@RequestMapping("/wish.htm")  //best
	public  Model process(){
		String wMsg=null;
		Model model=null;
		//use Service
		wMsg=service.generateWishMessage();
		//create Model obj
		model= new ExtendedModelMap();
	    model.addAttribute("msg",wMsg);
		return model;
	}*/
	
	/*@RequestMapping("/wish.htm")  //best
	public  ModelMap process(){
		String wMsg=null;
		ModelMap map=null;
		//use Service
		wMsg=service.generateWishMessage();
		//create Model obj
		map=new ModelMap();
	    map.put("msg",wMsg);
		return map;
	}*/
	
	/*@RequestMapping("/wish.htm")  //best
	public  Map process(){
		String wMsg=null;
		Map<String,Object> map=null;
		//use Service
		wMsg=service.generateWishMessage();
		//create Model obj
		map=new HashMap();
	    map.put("msg",wMsg);
		return map;
	}*/
	
	@RequestMapping("/wish.htm")  //best
	public  void process(Map<String,Object> map){
		String wMsg=null;
		//use Service
		wMsg=service.generateWishMessage();
		//create Model obj
	    map.put("msg",wMsg);
	    
	}

}
