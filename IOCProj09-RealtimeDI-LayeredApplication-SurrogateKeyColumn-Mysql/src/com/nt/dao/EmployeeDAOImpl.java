package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public final class EmployeeDAOImpl implements EmployeeDAO {
	private static final String EMPLOYEE_INSERT_QUERY = "INSERT INTO REALTIMEDI_EMPLOYEE(ENAME,SALARY,GROSSSALARY,NETSALARY) VALUES(?,?,?,?)";
	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps=null;
		int count=0;
		// get pooled connection object
		con = ds.getConnection();
		//create PrpearedSTatement object
		ps=con.prepareStatement(EMPLOYEE_INSERT_QUERY);
		//set values to Query params
		//ps.setInt(1,bo.getEno());
	   ps.setString(1,bo.getEname());
	   ps.setFloat(2,bo.getSalary());
	   ps.setFloat(3,bo.getGrossSalary());
	   ps.setFloat(4,bo.getNetSalary());
	   //execute the Query
	   count=ps.executeUpdate();
	   //close jdbc objs
	   ps.close();
	   con.close();
		return count;
	}
}
