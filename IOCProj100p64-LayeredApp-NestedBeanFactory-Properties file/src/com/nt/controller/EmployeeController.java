package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

@Component("empController")
public class EmployeeController {
	
	@Autowired
   	private EmployeeService service;
	
	   
	   public List<EmployeeDTO> processRequest(String desg)throws Exception{
		   List<EmployeeDTO> listDTO=null;
		   //use Service
		   listDTO=service.findEmpsByDesg(desg);
		   return listDTO;
	   }
}
