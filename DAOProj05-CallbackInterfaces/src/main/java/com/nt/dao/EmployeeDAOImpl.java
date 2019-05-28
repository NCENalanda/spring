package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String  GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String  GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	private JdbcTemplate jt;

	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public EmployeeBO getEmpDetailsByNo(int eno) {
		EmployeeBO bo=null;
		bo=jt.queryForObject(GET_EMP_DETAILS_BY_NO, new EmployeeRowMapper(), eno);
		return bo;
	}

	@Override
	public List<EmployeeBO> getEmpDetailsByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		listBO=jt.query(GET_EMP_DETAILS_BY_DESG,new EmployeeExtractor(),desg);
		return listBO;
	}
	
	private  class EmployeeRowMapper  implements RowMapper<EmployeeBO>{

		@Override
		public EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
			EmployeeBO bo=null;
			   //copy ResultSet obj record to EmployeeBO
			  bo=new  EmployeeBO();
			  bo.setEno(rs.getInt(1));
			  bo.setEname(rs.getString(2));
			  bo.setDesg(rs.getString(3));
			  bo.setSalary(rs.getInt(4));
			return bo;
		}//method
	}//inner class
	private class  EmployeeExtractor implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			EmployeeBO bo=null;
			List<EmployeeBO> listBO=null;
			listBO=new ArrayList();
			while(rs.next()){
				bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				listBO.add(bo);
			}
			return listBO;
		}//method
	}//inner class

}//outer class
