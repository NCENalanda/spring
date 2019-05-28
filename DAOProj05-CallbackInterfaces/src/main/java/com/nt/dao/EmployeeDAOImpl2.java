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

public class EmployeeDAOImpl2 implements EmployeeDAO {
	private static final String  GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String  GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	private JdbcTemplate jt;

	public EmployeeDAOImpl2(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public EmployeeBO getEmpDetailsByNo(int eno) {
		EmployeeBO bo=null;
		bo=jt.queryForObject(GET_EMP_DETAILS_BY_NO, (rs,index)->{
				EmployeeBO ebo=null;
				ebo=new EmployeeBO();
				ebo.setEno(rs.getInt(1));
				ebo.setEname(rs.getString(2));
				ebo.setDesg(rs.getString(3));
				ebo.setSalary(rs.getInt(4));
              return ebo;
			}
		,
		eno);
		
		return bo;
	}

	@Override
	public List<EmployeeBO> getEmpDetailsByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		listBO=jt.query(GET_EMP_DETAILS_BY_DESG,rs->{
				List<EmployeeBO> listEBO=null;
				EmployeeBO bo=null;
				listEBO=new ArrayList<>();
				while(rs.next()){
					bo=new EmployeeBO();
					bo.setEno(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setDesg(rs.getString(3));
					bo.setSalary(rs.getInt(4));
					listEBO.add(bo);
				}
				return listEBO;
			}
		,
		desg);
		return listBO;
	}
	
	
}//outer class
