package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class EditStudentController extends SimpleFormController{
	private StudentService  service;
	
	public EditStudentController(StudentService service) {
		this.service = service;
	}

	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
		  StudentDTO dto=null;
		  StudentCommand cmd=null;
		  //use SErvice
		  dto=service.fetchStudentBySno(Integer.parseInt(request.getParameter("sid")));
		  //create Command obj with Dynamic data collectied from DTO
		  cmd=new StudentCommand();
		  BeanUtils.copyProperties(dto, cmd);
		  return cmd;
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		StudentCommand cmd=null;
		StudentDTO dto=null;
		String updateMsg=null;
		List<StudentDTO> listDTO=null;
		ModelAndView mav=null;
		//type casting
		cmd=(StudentCommand)command;
		//convert Command into DTO
		dto=new StudentDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use Service
		updateMsg=service.modifyStudentBySno(dto);
		listDTO=service.fetchStudents();
		//create and return MAV
		mav=new ModelAndView();
		mav.addObject("studDetails", listDTO);
		mav.addObject("result", updateMsg);
		mav.setViewName("studs_report");
		return mav;
		
	}

}
