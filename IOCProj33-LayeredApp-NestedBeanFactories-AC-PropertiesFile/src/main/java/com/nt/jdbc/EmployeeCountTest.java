package com.nt.jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class EmployeeCountTest {
  private static final String GET_EMPs_COUNT="SELECT COUNT(*) FROM EMP";
	public static void main(String[] args) {
		InputStream is=null;
		Properties props=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			//Locate Properties file
			is=new FileInputStream("src/main/java/com/nt/commons/jdbc.properties");
			//create Properties obj and load content to it
			props=new Properties();
			props.load(is);
			//register jdbc driver
			Class.forName(props.getProperty("jdbc.driver"));
			//establish the connection
			con=DriverManager.getConnection(props.getProperty("jdbc.url"),props.getProperty("jdbc.user"),props.getProperty("jdbc.pwd"));
			//create PreparedSTatement object
			ps=con.prepareStatement(GET_EMPs_COUNT);
			//send and execute SQL Query to Db s/w
			rs=ps.executeQuery();
			//process the ResultSEt 
			if(rs.next()){
				System.out.println("Emps count::"+rs.getInt(1));
			}
		}//try
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			//close jdbc objs
			try{
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(con!=null)
					con.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}//finally
	}//main
}//class
