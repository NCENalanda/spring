package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMPS_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String  GET_EMP_SALARY_BY_EMPNO="SELECT SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	private static final String  INSERT_EMP_DETAILS="INSERT INTO EMP(EMPNO,ENAME,JOB) VALUES(?,?,?)";
	private static final String  UPDATE_NEW_SALARY_BY_EMPNO="UPDATE EMP SET SAL=? WHERE EMPNO=?";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int getEmpsCount() {
		int count=0;
		//execute Query
			count=jt.queryForObject(GET_EMPS_COUNT,new Object[]{},Integer.class);
		return count;
	}
	
	@Override
	public float getSalary(int empNo) {
		float salary=0.0f;
		salary=jt.queryForObject(GET_EMP_SALARY_BY_EMPNO , Float.class,empNo);
		return salary;
	}
	
	@Override
	public Map<String, Object> getEmpDetailsByNo(int empNo) {
		Map<String,Object> map=null;
		map=jt.queryForMap(GET_EMP_DETAILS_BY_NO,empNo);
		return map;
	}
	
	@Override
	public List<Map<String, Object>> getEmpDetailsByDesg(String desg) {
	  List<Map<String,Object>> list=null;
	  list=jt.queryForList(GET_EMP_DETAILS_BY_DESG, desg);
		return list;
	}
	
	@Override
	public int insertEmp(int empNo, String ename, String desg) {
		int count=0;
		count=jt.update(INSERT_EMP_DETAILS, empNo,ename,desg);
		return count;
	}
	
	@Override
	public int updateNewSalaryByEmpNo(int empNo, float newSalary) {
		int count=0;
		count=jt.update(UPDATE_NEW_SALARY_BY_EMPNO,newSalary,empNo);
	    return count;
	}

}
