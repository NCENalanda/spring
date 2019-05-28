package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl.0-param  construtor");
	}

	

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("EmployeeServiceImpl.registerEmployee(-)");
		int  grossSalary=0,netSalary=0;
		EmployeeBO  bo=null;
		int count=0;
		//write b.logic
		grossSalary=Math.round(dto.getBasicSalary()+ dto.getBasicSalary()*0.3f);
		netSalary=Math.round(grossSalary-(grossSalary*0.2f));
		//prepare EmployeeBO class obj having PErsitable Data
		bo=new EmployeeBO();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return "Registration Failed -->GrossSalary:::"+grossSalary+" NetSalary::"+netSalary;
		else
			return "Registration Succeded -->GrossSalary:::"+grossSalary+" NetSalary::"+netSalary;
	}//method
}//class
