package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public class CollegeDAOImpl implements CollegeDAO {

	public CollegeDAOImpl() {
		System.out.println("CollegeDAOImpl::0-param constructor");
	}
	
	@Override
	public int insertStudent(StudentBO stBO) {
		System.out.println("CollegeDAO:inserting Student ....."+stBO.getPid()+" "+stBO.getPname()+" "+stBO.getCourse()+" "+stBO.getDoj());
		return 1;
	}

	@Override
	public int insertEmployee(EmployeeBO empBO) {
		System.out.println("CollegeDAO:inserting Employee ....."+empBO.getPid()+" "+empBO.getPname()+" "+empBO.getDesg()+" "+empBO.getDoj());
		return 1;
	}

}
