package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.command.EmployeeCommand;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;
import com.nt.service.EmployeeSearchService;

@Controller
public class EmployeeSearchController {
	@Autowired
	 private  EmployeeSearchService  service;

	
@RequestMapping("/doSearch.htm")
	public String performSearch(Map<String,Object> map,@ModelAttribute EmployeeCommand cmd)
			throws Exception {
		EmployeeDTO dto=null;
		List<EmployeeResultDTO> listRDTO=null;
		//copy Command to DTO
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(cmd, dto);
		//use SErvice class
		listRDTO=service.findEmployees(dto);
		//create and return MAV
		map.put("empResults",listRDTO);
		return "list_emps";
	}//method
}//class
