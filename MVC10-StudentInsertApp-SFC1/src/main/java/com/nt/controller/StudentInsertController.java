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
		//Convert Command obj to DTO object
		dto=new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		//use Service
		resultMsg=service.register(dto);
		//return MAV object
		return new ModelAndView(getSuccessView(),"resultMsg",resultMsg);
	}

}
