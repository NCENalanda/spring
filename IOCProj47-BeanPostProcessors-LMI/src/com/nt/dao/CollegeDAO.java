package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public interface CollegeDAO {
	public  int insertData(StudentBO bo);
	public  int insertData(EmployeeBO bo);

}
