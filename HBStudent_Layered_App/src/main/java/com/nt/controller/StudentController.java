package com.nt.controller;

import com.nt.domain.Student;
import com.nt.service.StudentService;
import com.nt.service.StudentServiceFactory;

public class StudentController {
	private  StudentService service;
	
	public  Object getStudent(int id)throws Exception {
		Object obj=null;
		service=StudentServiceFactory.getInstance();
		obj=service.getStudent(id);
		System.out.println(obj.toString());
		return obj;
	}//method
	
	public  String updateStudent(Student st)throws Exception {
		
		service=StudentServiceFactory.getInstance();
		Object obj=service.updateStudent(st);
		return obj.toString();
		
	}
	public  String saveStudent(Student st)throws Exception {
		service=StudentServiceFactory.getInstance();
		String str=service.saveStudent(st);
		return str;
	}
	
	public  String deleteStudent(int id)throws Exception {
		service=StudentServiceFactory.getInstance();
		String str=service.deleteStudent(id);
		return str;
	}

}
