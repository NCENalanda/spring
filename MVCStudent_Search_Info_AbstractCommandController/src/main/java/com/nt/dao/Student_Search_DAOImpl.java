package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.StudentBO;

public class Student_Search_DAOImpl implements Student_Search_DAO {
	//private static Logger logger=Logger.getLogger(Student_Search_DAOImpl.class);
	
	//private static final String SEARCH_STUDENTS="SELECT NAME,RANK,SID FROM STUDENT_TAB1 WHERE  NAME=? OR RANK=? OR AND SID=?";
	private static final String SEARCH_STUDENTS="select name , rank, sid from student_tab1 where name='Ayush' or rank=103 or sid=1101";
	private JdbcTemplate jt;
	public Student_Search_DAOImpl(JdbcTemplate jt) {
		// TODO Auto-generated constructor stub
		this.jt=jt;
	}
	
	
	@Override
	public List<StudentBO> search(StudentBO bo) {
		System.out.println("####################################################################################################");
		System.out.println("In dao ");
		System.out.println("########################################################################################################");
		// TODO Auto-generated method stub
		List<StudentBO> listBO=null;
		//listBO=jt.query(SEARCH_STUDENTS, new StudentExtrator(),bo.getName(),bo.getRank(),bo.getId());
		listBO=jt.query(SEARCH_STUDENTS, new StudentExtrator());
		System.out.println("listbo"+listBO.toString());
		return listBO;
	}//close serach()
	
	//INNER CLASSS
	
	private class StudentExtrator implements ResultSetExtractor<List<StudentBO>>{

		@Override
		public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			StudentBO bo=null;
			List<StudentBO> listBO=null;
			//add the BO obj in a container
			listBO=new ArrayList<>();
			//iterate the BO from ResultSet
			while (rs.next()) {
				bo=new StudentBO();
				bo.setName(rs.getString(1));
				bo.setRank(rs.getInt(2));
				bo.setId(rs.getInt(3));
				listBO.add(bo);
			}//while
			return listBO;
		}//extractData()
		
	}//inner class

}//class
