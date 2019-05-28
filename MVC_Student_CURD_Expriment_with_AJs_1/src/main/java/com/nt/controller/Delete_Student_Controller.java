package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDTO;
import com.nt.service.Student_Service;

public class Delete_Student_Controller extends AbstractController {
	private Student_Service service;
	public Delete_Student_Controller(Student_Service service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		int id=0;
		String msg=null;
		List<StudentDTO> listDTO=null;
		ModelAndView mav=null;
		//read the id from request
		id=Integer.parseInt(request.getParameter("id"));
		//delete the records
		msg=service.deleteInfo(id);
		//fetch the all records
		listDTO=service.getAllRecords();
		mav=new ModelAndView();
		//set attributes msg &listDTO
		mav.addObject("message", msg);
		mav.addObject("list",listDTO);
		mav.setViewName("all_records");
		
		return mav;
	}
	
	

}
