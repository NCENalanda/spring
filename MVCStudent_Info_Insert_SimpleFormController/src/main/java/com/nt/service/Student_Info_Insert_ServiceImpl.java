package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.Student_Info_InsertDAO;
import com.nt.dto.StudentDTO;

public class Student_Info_Insert_ServiceImpl implements Student_Info_Insert_Service {
 
	private Student_Info_InsertDAO dao;
	
	public Student_Info_Insert_ServiceImpl(Student_Info_InsertDAO dao) {
		// TODO Auto-generated constructor stub
		this.dao=dao;
	}
	@Override
	public String save(StudentDTO dto) {
		// TODO Auto-generated method stub
		
		//Create the Variable
		StudentBO bo=null;
		String msg=null;
		
		//initialize the variable
		bo =new StudentBO();
		BeanUtils.copyProperties(dto,bo);
		int i=dao.insert(bo);
		if(i>0)
			msg="Successful";
		else
			msg="UnScessful";
		
		//for garbage
		dto=null;
		bo=null;
		
		return msg;
	}

}
