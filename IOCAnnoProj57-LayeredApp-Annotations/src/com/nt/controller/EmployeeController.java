package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

@Component("empController")
public class EmployeeController {
	@Autowired
  private EmployeeService  service;


 public String  processEmployee(EmployeeVO vo)throws Exception{
	 System.out.println("EmployeeController.processEmployee(-)");
	 EmployeeDTO dto=null;
	 String result=null;
	 //Convert EmployeeVO class obj to EmployeeDTO class object
	 dto=new EmployeeDTO();
	 dto.setEno(Integer.parseInt(vo.getEno()));
	 dto.setEname(vo.getEname());
	 dto.setAddrs(vo.getAddress());
	 dto.setBasicSalary(Integer.parseInt(vo.getBasicSalary()));
	 dto.setCompany(vo.getCompany());
	 //use Service class
	  result=service.registerEmployee(dto);
	  return result;
   }//method
}//class
