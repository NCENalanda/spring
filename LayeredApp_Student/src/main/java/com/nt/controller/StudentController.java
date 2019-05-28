package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.service.StudentServiceFactory;
import com.nt.vo.StudentVO;

public class StudentController {
	
	public String evaluateStudent(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		StudentService service=null;
		String result=null;
		//convert StudentVO class obj to StudentDTO class obj
		dto=new StudentDTO();
		dto.setName(vo.getName());
		dto.setRank(Integer.parseInt(vo.getRank()));
		dto.setId(Integer.parseInt(vo.getId()));
		
		//get  Service class obj
		service=StudentServiceFactory.getInstance();
		//use Service
		result=service.generateResult(dto);
		return result;
	}//method
}//class
