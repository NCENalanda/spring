package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.bo.StudentBO;
import com.nt.dto.StudentDTO;
import com.nt.service.Student_InfoService;

public class Student_All_Info_AbstractController extends AbstractController {
	private Student_InfoService service;
	public Student_All_Info_AbstractController(Student_InfoService service) {
		System.out.println("-----------Controller----------------");
		// TODO Auto-generated constructor stub
		this.service=service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav=null;
		List<StudentDTO> listDTO=null;
		listDTO=service.getAllDetails();
		mav=new ModelAndView();
		mav.setViewName("st_info");
		mav.addObject("list",listDTO);
		
		return mav;
	}

}
