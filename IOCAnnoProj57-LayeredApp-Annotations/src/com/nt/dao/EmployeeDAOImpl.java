package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String  INSERT_EMPLOYEE_QUERY="INSERT INTO SPRING_LAYERED_EMPLOYEE(ENO,ENAME,BASICSALARY,GROSSSALARY,NETSALARY) VALUES(?,?,?,?,?)";
   @Autowired
	private DataSource  ds;
	


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
		ps.setInt(1, bo.getEno());
		ps.setString(2,bo.getEname());
		ps.setInt(3,bo.getBasicSalary());
		ps.setInt(4,bo.getGrossSalary());
		ps.setInt(5,bo.getNetSalary());
		//execute the Query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}//method

}
