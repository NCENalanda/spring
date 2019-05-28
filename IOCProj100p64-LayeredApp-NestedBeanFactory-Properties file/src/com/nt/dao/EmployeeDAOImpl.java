package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String  GET_EMPS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
    @Autowired
	private  DataSource ds;
    	
	@Override
	public List<EmployeeBO> retriveEmpsByDesg(String desg)throws Exception {
		 Connection con=null;
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 EmployeeBO bo=null;
		 List<EmployeeBO> listBO=null;
		//get Connection object from jdbc con pool
		 con=ds.getConnection();
		 //create PreparedStatement object
		 ps=con.prepareStatement(GET_EMPS_BY_DESG);
		 //set value to Query param
		 ps.setString(1,desg);
		 //execute Query
		 rs=ps.executeQuery();
		 //process the ResultSet
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
	}
	

}
