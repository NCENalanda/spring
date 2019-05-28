package com.nt.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
	public int  fetchEmpsCount();
	public float fetchEmpSalary(int empNo);
	public Map<String,Object> fetchEmpDetailsByNo(int empNo);
	public List<Map<String,Object>> listEmpDetailsByDesg(String desg);
	public String  registerEmp(int empNo,String ename,String job);
	public String  hikeEmpSalaryByNo(int empNo,float percentage);
}
