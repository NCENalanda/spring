package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowCountCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl3 implements EmployeeDAO {
	private static final String  GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String  GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	private JdbcTemplate jt;

	public EmployeeDAOImpl3(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public EmployeeBO getEmpDetailsByNo(int eno) {
		EmployeeBO bo=null;
		bo=jt.queryForObject(GET_EMP_DETAILS_BY_NO, new RowMapper<EmployeeBO>(){

			@Override
			public EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
				EmployeeBO bo=null;
				bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
              return bo;
			}
			
		},
		eno);
		
		return bo;
	}

	
	@Override
	public List<EmployeeBO> getEmpDetailsByDesg(String desg) {
		List<EmployeeBO> listBO=new ArrayList();
		jt.query(GET_EMP_DETAILS_BY_DESG,new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				System.out.println("processRow(-)");
				EmployeeBO bo=null;
				//copy each record to BO class object
				bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				listBO.add(bo);
			}
			},
		desg);
		return listBO;
	}
	
	
}//outer class
