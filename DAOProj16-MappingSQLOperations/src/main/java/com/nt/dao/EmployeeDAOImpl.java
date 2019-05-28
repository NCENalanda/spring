package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMPS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?) ORDER BY JOB";
	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO =?";
	private static final  String EMP_INSERT="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(?,?,?,?)";	
	
	private EmployeeSelector selector;
	private EmployeeSelector1 selector1;
	private EmployeeUpdator updator;
	
	public EmployeeDAOImpl(DataSource  ds) {
		System.out.println("EmployeeDAOImpl:1-param constructor");
		selector=new EmployeeSelector(ds, GET_EMPS_BY_DESG);
		selector1=new EmployeeSelector1(ds, GET_EMP_BY_NO);
		updator=new EmployeeUpdator(ds, EMP_INSERT);
	}

	
	@Override
	public int insert(EmployeeBO bo) {
	    int count=0;
	    count=updator.update(bo.getEno(),bo.getEname(),bo.getDesg(),bo.getSalary());
		return count;
	}

	@Override
	public List<EmployeeBO> getEmployeesByDesgs(String desg1, String desg2) {
		List<EmployeeBO> listBO=null;
		listBO=selector.execute(desg1,desg2);
		return listBO;
	}
	
	@Override
	public EmployeeBO getEmployeeByNo(int no) {
		EmployeeBO bo=null;
		bo=selector1.findObject(no);
		return bo;
	}
	
	private static class EmployeeSelector extends MappingSqlQuery<EmployeeBO>{
		
		public EmployeeSelector(DataSource ds ,String query) {
			 super(ds,query);
			 System.out.println("EmployeeSelector:2-param constructor");
			 super.declareParameter(new SqlParameter(Types.VARCHAR));
			 super.declareParameter(new SqlParameter(Types.VARCHAR));
			 super.compile();
		}

		@Override
		protected EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
			System.out.println("EmployeeSelector: mapRow(-,-)");
			EmployeeBO bo=null;
		   //copy ResultSet obj record to EmployeeBO
			bo=new EmployeeBO();
			bo.setEno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setDesg(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			return bo;
		}
		
	}//inner class
	private static class EmployeeSelector1 extends MappingSqlQuery<EmployeeBO>{
		
		public EmployeeSelector1(DataSource ds ,String query) {
			 super(ds,query);
			 System.out.println("EmployeeSelector1:2-param constructor");
			 super.declareParameter(new SqlParameter(Types.INTEGER));
			 super.compile();
		}

		@Override
		protected EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
			EmployeeBO bo=null;
			   //copy ResultSet obj record to EmployeeBO
				bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				return bo;
		}//mapRow(-,-)
		
	}//inner class2
	
	private static class EmployeeUpdator extends SqlUpdate{
		public EmployeeUpdator(DataSource ds,String query) {
			 super(ds,query);
			 System.out.println("EmployeeUpdator:2-param constructor");
			 super.declareParameter(new SqlParameter(Types.INTEGER));
			 super.declareParameter(new SqlParameter(Types.VARCHAR));
			 super.declareParameter(new SqlParameter(Types.VARCHAR));
			 super.declareParameter(new SqlParameter(Types.INTEGER));
			 super.compile();
		}
	}

}
