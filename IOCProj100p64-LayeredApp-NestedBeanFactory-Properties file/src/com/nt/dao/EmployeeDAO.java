package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO>  retriveEmpsByDesg(String desg)throws Exception;
}
