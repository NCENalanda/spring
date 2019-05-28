package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class EmployeeController {
	 private EmployeeService service;
	
	public void setService(EmployeeService service) {
		this.service = service;
	}

	public String process(String eno,String ename,String salary)throws Exception{
		   EmployeeVO  vo=null;
		   EmployeeDTO dto=null;
		   String result=null;
		   //Store input values in EmployeeVO class object (optional)
		   vo=new EmployeeVO();
		   vo.setEno(eno);
		   vo.setEname(ename);
		   vo.setSalary(salary);
		   //Convert VO class object to DTO class object
		   dto=new EmployeeDTO();
		   dto.setEno(Integer.parseInt(vo.getEno()));
		   dto.setEname(vo.getEname());
		   dto.setSalary(Float.parseFloat(vo.getSalary()));
		   //use Service 
		   result=service.generatePaySlip(dto);
		   return result;
	}

}
