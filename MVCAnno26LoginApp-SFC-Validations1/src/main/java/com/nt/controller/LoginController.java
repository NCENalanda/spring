package com.nt.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;
import com.nt.validator.UserValidator;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	@Autowired
	private UserValidator validator;
	
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
			                                           @ModelAttribute("userCmd")UserCommand cmd,BindingResult errors){
		UserDTO dto=null;
		String result=null;
		//perform validations using Validator 
		if(validator.supports(UserCommand.class)){
			validator.validate(cmd, errors);
			if(errors.hasErrors()){
				return "login_form";
			}
		}
		else{
			return "login_form";
		}
		//Convert command to dTO
		dto=new UserDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use service
		result=service.validate(dto);
		map.put("result", result);
		return "login_form";
	}

}
