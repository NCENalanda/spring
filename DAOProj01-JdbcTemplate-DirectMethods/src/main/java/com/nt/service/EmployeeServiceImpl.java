package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {
  
private  EmployeeDAO dao;

public void setDao(EmployeeDAO dao) {
	this.dao = dao;
}
	@Override
	public int fetchEmpsCount() {
		//use DAO
		return dao.getEmpsCount();
	}
	
	@Override
		public float fetchEmpSalary(int empNo) {
			//use DAO class
			return dao.getSalary(empNo);
		}
	
	@Override
		public Map<String, Object> fetchEmpDetailsByNo(int empNo) {
		//use DAO
			return  dao.getEmpDetailsByNo(empNo);
		}
	
	@Override
		public List<Map<String, Object>> listEmpDetailsByDesg(String desg) {
			//use DAO
		   return dao.getEmpDetailsByDesg(desg);
		}
	
	@Override
		public String registerEmp(int empNo, String ename, String job) {
		int count=0;
		   //use DAO
		count=dao.insertEmp(empNo, ename, job);
		  if(count==0)
			    return "Emp  Registration Failed";
		  else
			  return "Emp Registration succeded  with Employee Number::"+empNo;
		}
	
	@Override
		public String hikeEmpSalaryByNo(int empNo, float percentage) {
		float currentSalary=0.0f,newSalary=0.0f;
		int count=0;
		    // get Exisitng Salary
		   currentSalary=fetchEmpSalary(empNo);
		   newSalary=currentSalary+currentSalary*(percentage/100.0f);
		   //use DAO
		   count=dao.updateNewSalaryByEmpNo(empNo, newSalary);
		   if(count==0)
			   return "Salary not hiked for Emp whose EmpNo is"+empNo;
		   else
			   return "Salary  hiked for Emp whose EmpNo is"+empNo+" and newSalary::"+newSalary;
		}
}
