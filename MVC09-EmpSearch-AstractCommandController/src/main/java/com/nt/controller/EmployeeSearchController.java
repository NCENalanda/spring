package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.EmployeeCommand;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;
import com.nt.service.EmployeeSearchService;

public class EmployeeSearchController extends AbstractCommandController {
	 private  EmployeeSearchService  service;

	public EmployeeSearchController(EmployeeSearchService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object cmd, BindException be)
			throws Exception {
		EmployeeCommand command;
		EmployeeDTO dto=null;
		List<EmployeeResultDTO> listRDTO=null;
		ModelAndView mav=null;
		//type casting
		command=(EmployeeCommand)cmd;
		//copy Command to DTO
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(command, dto);
		//use SErvice class
		listRDTO=service.findEmployees(dto);
		//create and return MAV
		mav=new ModelAndView();
		mav.setViewName("list_emps");
		mav.addObject("searchResults",listRDTO);
		return mav;
	}//method
}//class
