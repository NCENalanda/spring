package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl.0-param  construtor");
	}

	public void setDao(EmployeeDAO dao) {
		System.out.println("EmployeeServiceImpl.setDao(-)");
		this.dao = dao;
	}

	@Override
	public  String registerEmployee(EmployeeDTO dto)throws Exception {
		System.out.println("EmployeeServiceImpl.registerEmployee(-)");
		int  grossSalary=0,netSalary=0;
		EmployeeBO  bo=null;
		int count=0;
		//write b.logic
		grossSalary=Math.round(dto.getBasicSalary()+ dto.getBasicSalary()*0.3f);
		netSalary=Math.round(grossSalary-(grossSalary*0.2f));
		//prepare EmployeeBO class obj having PErsitable Data
		bo=new EmployeeBO();
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
