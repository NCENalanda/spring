package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class DeleteStudentController extends AbstractController{
	private StudentService  service;
	
	public DeleteStudentController(StudentService service) {
		this.service = service;
	}
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String deleteMsg=null;
		List<StudentDTO> listDTO=null;
		ModelAndView mav=null;
		//use servie
		deleteMsg=service.removeStudentBySno(Integer.parseInt(req.getParameter("sid")));
		listDTO=service.fetchStudents();
		//create and return MAV
		mav=new ModelAndView();
		mav.addObject("studDetails", listDTO);
		mav.addObject("result", deleteMsg);
		mav.setViewName("studs_report");
		return mav;
		
	}


	
}
