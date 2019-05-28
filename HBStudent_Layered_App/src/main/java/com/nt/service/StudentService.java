package com.nt.service;

import com.nt.domain.Student;

public interface StudentService {
	public Object getStudent(int id)throws Exception;
	public Object updateStudent(Student dt)throws Exception;
	public String saveStudent(Student st)throws Exception;
	public String deleteStudent(int id)throws Exception;
	

}
