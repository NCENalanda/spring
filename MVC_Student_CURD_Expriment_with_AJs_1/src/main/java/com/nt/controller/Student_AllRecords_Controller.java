package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.Student_Service;

public class Student_AllRecords_Controller extends AbstractController {
	
	private Student_Service service;
	public Student_AllRecords_Controller(Student_Service service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<StudentDTO> listDTO=null;
		//get all records from service to Database
		listDTO=service.getAllRecords();
		
		return new ModelAndView("all_records","list",listDTO);
	}

}
