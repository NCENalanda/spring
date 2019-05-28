package com.nt.newmod;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class GetEmpCount {

	public static void main(String[] args) throws Exception{
		InputStream is=null;
		Properties props=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		//Locate Properties file
		is=new FileInputStream("src/com/nt/commons/jdbc.properties");
		//Load Properties file info to java.util.Properties class object
		props=new Properties();
		props.load(is);
		//write jdbc code
		Class.forName(props.getProperty("jdbc.driver"));
		con=DriverManager.getConnection(props.getProperty("jdbc.url"),
				                                                          props.getProperty("jdbc.user"),
				                                                          props.getProperty("jdbc.pwd"));
		//create STatement object
		st=con.createStatement();
		//execute query
		rs=st.executeQuery("SELECT COUNT(*) FROM EMP");
		//process the ResultSet
		if(rs.next()){
			System.out.println("Records count::"+rs.getInt(1));
		}
		//close jdbc objs
		rs.close();
		st.close();
		con.close();
	}//main
}//class
