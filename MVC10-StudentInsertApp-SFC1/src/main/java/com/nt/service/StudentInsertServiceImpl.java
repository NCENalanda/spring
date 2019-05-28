package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentInsertDAO;
import com.nt.dto.StudentDTO;

public class StudentInsertServiceImpl implements StudentInsertService {
  	private StudentInsertDAO  dao;
	
	 public StudentInsertServiceImpl(StudentInsertDAO dao) {
			this.dao = dao;
		}


	public String register(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		//Convert DTO to BO
		bo=new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		//use DAO
		count=dao.insert(bo);
		//process the result
		if(count==0)
			  return "Registrration failed";
		else
			return "Registration succeded";
	}

}
