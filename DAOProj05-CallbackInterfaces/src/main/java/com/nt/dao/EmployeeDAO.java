package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public  EmployeeBO  getEmpDetailsByNo(int eno);
	public List<EmployeeBO> getEmpDetailsByDesg(String desg);

}
