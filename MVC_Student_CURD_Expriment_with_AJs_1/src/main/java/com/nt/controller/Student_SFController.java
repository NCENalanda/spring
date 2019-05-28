package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.Student_Service;

public class Student_SFController extends SimpleFormController {
	private Student_Service service;
	
	public Student_SFController(Student_Service service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object cmd,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		StudentCommand command=null;
		ModelAndView mav=null;
		String str=null;
		StudentDTO dto=null;
		List<StudentDTO> listDTO=null;
		dto=new StudentDTO();
		//casting Command Obj
		command=(StudentCommand) cmd;
		//convert Command to Dto
		BeanUtils.copyProperties(command, dto);
		
		//save the data in database
		str=service.insertInfo(dto);
		//get all records & Refresh 
		listDTO=service.getAllRecords();
		
		mav=new ModelAndView();
		mav.addObject("message", str);
		mav.addObject("list", listDTO);
		mav.setViewName("all_records");
		return mav;
	}
	
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		String msg="Double Posting not allowed ";
		return new ModelAndView("error" , "errMsg", msg);
	}

}
