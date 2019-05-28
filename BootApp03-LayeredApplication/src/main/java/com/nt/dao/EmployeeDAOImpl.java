package com.nt.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.sql.DataSource;
@Named("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM REALTIMEDI_EMPLOYEE";
   @Resource
	private DataSource ds;
   
	@Override
	public int getEmpsCount()throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int count=0;
		//get PooledConnection
		con=ds.getConnection();
		//create PrpearedStatement object
		ps=con.prepareStatement(GET_EMP_COUNT);
		//execute the Query
		rs=ps.executeQuery();
		//process the ResultSet
		if(rs.next()){
			count=rs.getInt(1);
		}
		//release connection obj
		  ps.close();
		  con.close();
		return count;
	}

}
