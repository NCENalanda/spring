package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
	public int getEmpsCount();
	public float getSalary(int empNo);
	public Map<String,Object> getEmpDetailsByNo(int empNo);
	public List<Map<String,Object>>  getEmpDetailsByDesg(String desg);
	public  int insertEmp(int empNo,String ename,String desg);
	public  int  updateNewSalaryByEmpNo(int empNo,float newSalary);

}
