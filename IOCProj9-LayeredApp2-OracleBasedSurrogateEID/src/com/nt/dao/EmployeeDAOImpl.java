package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String  INSERT_EMPLOYEE_QUERY="INSERT INTO SPRING_LAYERED_EMPLOYEE(ENO,ENAME,BASICSALARY,GROSSSALARY,NETSALARY) VALUES(ENO_SEQUENCE.NEXTVAL,?,?,?,?)";
	private DataSource  ds;
	
	public EmployeeDAOImpl() {
		System.out.println("EmployeeDAOImpl.0-param cosntructor");
	}

	public void setDs(DataSource ds) {
		System.out.println("EmployeeDAOImpl.setDs(-)");
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl.insert(-)");
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get JDBC con object from jdbc con pool
		con=ds.getConnection();
		//create PreparedSTatement object
		ps=con.prepareStatement(INSERT_EMPLOYEE_QUERY);
		//set values to Query params
		ps.setString(1,bo.getEname());
		ps.setInt(2,bo.getBasicSalary());
		ps.setInt(3,bo.getGrossSalary());
		ps.setInt(4,bo.getNetSalary());
		//execute the Query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}//method

}
