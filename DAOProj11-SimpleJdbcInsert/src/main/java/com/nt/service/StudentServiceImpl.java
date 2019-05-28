package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {


	private StudentDAO dao;
	
	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	

	@Override
	public String register(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		//Convert DTO to BO
		bo=new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		//use dAO
		count=dao.insert(bo);
		if(count==0)
			return "Registration failed";
		else
			return "Registration succeded";
	}//method
}//class
