//Select6.java (Application that gives Emp Details based on given deptno)
package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest6{
	public static void main(String[] args){
		Scanner sc=null;
		Statement st=null;
		Connection con=null;
		ResultSet rs=null;
		try{
			//read inputs
			sc=new Scanner(System.in);
			System.out.println("Enter dept no");
			int deptno=0;
			if(sc!=null){
				deptno=sc.nextInt();
			}
			// register jdbc driver with DriverManager service
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("oracle.jdbc.OracleDriver");
			//Establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			//Create Jdbc Statement obj
			if(con!=null)
				st=con.createStatement();
			//send and execute SQL Query in DB s/w
			if(st!=null)
				rs=st.executeQuery("select empno,ename,job,sal from emp where deptno="+deptno);
			
			if(rs!=null){
				boolean flag=false;
				while(rs.next()){
					flag=true;
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
				}
				
				if(flag==false)
					System.out.println("Records not found");

				System.out.println("con obj class name::"+con.getClass());
                 System.out.println("st obj class name::"+st.getClass());
                 System.out.println("rs obj class name::"+rs.getClass());
				
			}//if
		}//try
	/*	catch(ClassNotFoundException cnf){  //To handle known exception
			cnf.printStackTrace();
		}*/
		catch(SQLException se){  // To handle known exception
			se.printStackTrace();
		}
		catch(Exception e){  // To handle unknown exception
			e.printStackTrace();
		}
		finally{
			//Close jdbc objs
			try{
				if(rs!=null)
					rs.close();
			}//try
			catch(Exception e){
				e.printStackTrace();
			}
			
			try{
				if(st!=null)
					st.close();
			}//try
			catch(Exception e){
				e.printStackTrace();
			}
			
			try{
				if(con!=null)
					con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}//finally
	}//main
}//class
//>javac   -d  .  SelectTest6.java
//>java  com.ds.SelectTest6





