package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeSearchDAO {
	
	public  List<EmployeeBO> findEmpsByDesg(String cond)throws Exception;

}
