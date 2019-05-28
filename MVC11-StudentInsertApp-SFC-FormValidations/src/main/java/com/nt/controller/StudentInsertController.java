package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentInsertService;

public class StudentInsertController extends SimpleFormController {
	private StudentInsertService service;
	
	public StudentInsertController(StudentInsertService service) {
		this.service = service;
	}

	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		StudentCommand cmd=null;
		StudentDTO dto=null;
		String resultMsg=null;
		//typecasting
		cmd=(StudentCommand)command;
		
		//application errors.
		if(cmd.getSadd().equals("pakistan") || cmd.getSadd().equals("republicchina")){
			errors.rejectValue("sadd","stCmd.sadd.restriction");
		 return	showForm(req, res,errors);
		}
		//Convert Command obj to DTO object
		dto=new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		//use Service
		resultMsg=service.register(dto);
		//return MAV object
		return new ModelAndView(getSuccessView(),"resultMsg",resultMsg);
	}
	
	@Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		System.out.println("handleInvalidSubmit(-,-)");
		return new ModelAndView("dbl_post_err");
		
	}
	
	@Override
	public Object formBackingObject(HttpServletRequest req) throws Exception {
		StudentCommand cmd=null;
		System.out.println("formBackingObject(-) method");
		cmd=new StudentCommand();
		cmd.setSno(4567);
		cmd.setSname("james bond");
		cmd.setSadd("japan");
		cmd.setCourse("java10");
		cmd.setAge(111);
		return cmd;
		
	}

}
