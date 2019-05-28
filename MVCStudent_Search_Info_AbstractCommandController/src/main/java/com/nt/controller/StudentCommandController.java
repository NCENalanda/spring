package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.Student_Info_Service;

public class StudentCommandController extends AbstractCommandController {
	private Student_Info_Service service;
	public StudentCommandController(Student_Info_Service service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		List<StudentDTO> listDTO=null;
		StudentCommand command=null;
		StudentDTO dto=null;
		ModelAndView mav=null;
		//casting
		command=(StudentCommand)cmd;
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println(command.toString());
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		dto=new StudentDTO();
		BeanUtils.copyProperties(command, dto);
		/**
		dto.setName(command.getName());
		dto.setRank(command.getRank());
		dto.setId(command.getId());
		*/
		System.out.println(dto.toString());
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		listDTO=service.getInfo(dto);
		mav= new ModelAndView();
		mav.setViewName("st_info");
		mav.addObject("list", listDTO);
		return mav;
	}

}
