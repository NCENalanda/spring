package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.EmployeeBO;
import com.nt.bo.EmployeeResultBO;

public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {
     private static final String GET_EMPs_BY_SEARCH_DETAILS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE (EMPNO IS NOT NULL AND EMPNO=?) OR (ENAME IS NOT NULL AND ENAME=?) OR (JOB IS NOT NULL AND JOB=?) OR (SAL IS NOT NULL AND SAL=?)";
   
	private JdbcTemplate jt;
	
	  public EmployeeSearchDAOImpl(JdbcTemplate jt) {
			this.jt = jt;
		}

     
	public List<EmployeeResultBO> search(EmployeeBO bo) {
		List<EmployeeResultBO> listRBO=null;
		listRBO=jt.query(GET_EMPs_BY_SEARCH_DETAILS, new EmployeeExtractor(), bo.getEmpNo(),bo.getEmpName(),bo.getJob(),bo.getSalary());
		return listRBO;
	}
	
	private class EmployeeExtractor implements ResultSetExtractor<List<EmployeeResultBO>>{

		public List<EmployeeResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeResultBO> listRBO=null;
			EmployeeResultBO rbo=null;
			//copy ResultSet records to ListRBO
			listRBO=new  ArrayList();
			while(rs.next()){
				rbo=new EmployeeResultBO();
				rbo.setEmpNo(rs.getInt(1));
				rbo.setEmpName(rs.getString(2));
				rbo.setJob(rs.getString(3));
				rbo.setSalary(rs.getInt(4));
				rbo.setDeptNo(rs.getInt(5));
				rbo.setMgr(rs.getInt(6));
				listRBO.add(rbo);
			}//while
			return listRBO;
		}//extractData(-)
	}//inner calss
}//calss
