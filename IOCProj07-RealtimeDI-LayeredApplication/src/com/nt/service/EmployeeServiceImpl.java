package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String generatePaySlip(EmployeeDTO dto) throws Exception {
		float gSal=0.0f,netSal=0.0f;
		EmployeeBO bo=null;
		int count=0;
		//write B.logic
		gSal=dto.getSalary()+ (dto.getSalary()*0.4f);
		netSal=gSal-(gSal*0.2f);
		//prepare EmployeeBO class object
		bo=new EmployeeBO();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setSalary(dto.getSalary());
		bo.setNetSalary(netSal);
		bo.setGrossSalary(gSal);
		//use DAO
		count=dao.insert(bo);
		//process the result
		if(count==0)
			 return "Employee Registration failed---> NetSalary:::"+netSal;
		 else			
			 return "Employee Registration succeded--> NetSalary:::"+netSal;
	}//generatePaySlip(-)

}//class
