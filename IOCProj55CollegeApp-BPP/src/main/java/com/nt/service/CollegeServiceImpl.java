package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.CollegeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public abstract class CollegeServiceImpl implements CollegeService {
    private CollegeDAO dao;
    
	public CollegeServiceImpl(CollegeDAO dao) {
		System.out.println("CollegeServiceImpl::1-param constructor");
		this.dao = dao;
	}
	public abstract StudentBO getStudentBO();
	public abstract  EmployeeBO getEmployeeBO();
	
	

	@Override
	public String processStudent(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		//get StudentBO class obj
		bo=getStudentBO();
		BeanUtils.copyProperties(dto,bo);
		//use dAO
		count=dao.insertStudent(bo);
		if(count==0)
		   return "Student registration failed";
		else
			return "Student registration Succeded";
	}

	@Override
	public String processEmployee(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
		//get StudentBO class obj
		bo=getEmployeeBO();
		BeanUtils.copyProperties(dto,bo);
		//use dAO
		count=dao.insertEmployee(bo);
		if(count==0)
		   return "Employee registration failed";
		else
			return "Employee registration Succeded";
	}

}
