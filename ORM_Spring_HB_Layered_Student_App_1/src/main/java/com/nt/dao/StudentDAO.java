package com.nt.dao;

import com.nt.domain.Student;

public interface StudentDAO {
	
	public Object getStudentInfo(int id)throws Exception ;
	public String  updateStudentInfo(Student st)throws Exception;
	public String saveStudentInfo(Student st)throws Exception;
	public String deleteStudentInfo(Student st)throws Exception;

}
