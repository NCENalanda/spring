package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class EmployeeController {
  private EmployeeService  service;
  public EmployeeController() {
	System.out.println("EmployeeController.0-param constructor");
}

public void setService(EmployeeService service) {
	System.out.println("EmployeeController.setService(-)");
	this.service = service;
}	

 public String  processEmployee(EmployeeVO vo)throws Exception{
	 System.out.println("EmployeeController.processEmployee(-)");
	 EmployeeDTO dto=null;
	 String result=null;
	 //Convert EmployeeVO class obj to EmployeeDTO class object
	 dto=new EmployeeDTO();
	 dto.setEname(vo.getEname());
	 dto.setAddrs(vo.getAddress());
	 dto.setBasicSalary(Integer.parseInt(vo.getBasicSalary()));
	 dto.setCompany(vo.getCompany());
	 //use Service class
	  result=service.registerEmployee(dto);
	  return result;
   }//method
}//class
