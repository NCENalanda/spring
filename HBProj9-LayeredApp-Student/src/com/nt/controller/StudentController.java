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
		dto.setSname(vo.getSname());
		dto.setCourse(vo.getCourse());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//get  Service class obj
		service=StudentServiceFactory.getInstance();
		//use Service
		result=service.generateResult(dto);
		return result;
	}//method
}//class
