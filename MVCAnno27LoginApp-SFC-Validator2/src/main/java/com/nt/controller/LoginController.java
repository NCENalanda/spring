package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	/*@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(Map<String,Object> map){
		UserCommand cmd=null;
		cmd=new UserCommand();
		cmd.setUname("raja"); cmd.setPwd("rani");
		map.put("userCmd", cmd);
		return "login_form";
	}*/
	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("userCmd") UserCommand cmd){
		return "login_form";
	}
	
	

	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public  String  processForm(Map<String,Object> map,
			                                          @Valid @ModelAttribute("userCmd")UserCommand cmd,
			                                          BindingResult errors){
		UserDTO dto=null;
		String result=null;
		if(errors.hasErrors())
			return "login_form";
		
		//Convert command to dTO
		dto=new UserDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use service
		result=service.validate(dto);
		map.put("result", result);
		map.put("cmdData", cmd);
		return "login_form";
	}
	
	@ModelAttribute("domains")
	public List<String>  populateDomains(){
		List<String> list=null;
		list=new ArrayList();
		list.add("gmail"); list.add("yahoomail"); list.add("rediff");
		return list;
	}
	
	@ModelAttribute("courses")
	public List<String>  populateCourses(){
		List<String> list=null;
		list=new ArrayList();
		list.add("java"); list.add(".net"); list.add("php");
		return list;
	}
	
	@InitBinder
	public  void myInitBinder(WebDataBinder binder){
		SimpleDateFormat sdf=null;
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}


}
