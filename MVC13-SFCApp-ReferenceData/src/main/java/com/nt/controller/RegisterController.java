package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.RegisterCommand;

public class RegisterController extends SimpleFormController {
	
	@Override
	public Map referenceData(HttpServletRequest req) throws Exception {
		System.out.println("referenceData(-)");
		Map<String,List<String>> map=null;
		List<String> qlfyList=null, hobiesList=null,coursesList=null;
		//create HashMap object
		map=new HashMap();
		//prepare List collections representing addtional Data
		qlfyList=new ArrayList();
		qlfyList.add("BE"); qlfyList.add("MCA"); qlfyList.add("Msc");
		qlfyList.add("BCA");
		
		hobiesList=new ArrayList();
		hobiesList.add("Reading Books"); hobiesList.add("surfing net");
		hobiesList.add("meditation"); hobiesList.add("Watching TV");
		
		coursesList=new ArrayList();
		coursesList.add("java"); coursesList.add(".net");
		coursesList.add("php"); coursesList.add("BigData");
		//add to Map collection
		map.put("cList",coursesList); map.put("hList",hobiesList);
		map.put("qList",qlfyList);
		return map;
	}//method
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		System.out.println("onSubmit(-)");
		  Map<String,List<String>> refMap=null;
		  ModelAndView mav=null;
		  refMap=referenceData(req);
		  mav=new ModelAndView();
		  mav.setViewName("register");
		/*  mav.addObject("regCmd",((RegisterCommand)command));*/
		  mav.addObject("regCmd",(command));
		  mav.addObject("qList",refMap.get("qList"));
		  mav.addObject("cList",refMap.get("cList"));
		  mav.addObject("hList",refMap.get("hList"));
		
		return mav;
		
	}
	
	
}//class
