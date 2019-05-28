package com.nt.service;

import javax.annotation.Resource;
import javax.inject.Named;

import com.nt.dao.EmployeeDAO;

@Named("empService")
public class EmployeeServiceImpl implements EmployeeService {
   @Resource
	private EmployeeDAO dao;
   
	@Override
	public int fetchEmpsCount() throws Exception {
		int count=0;
		count=dao.getEmpsCount();
		return count;
	}

}
