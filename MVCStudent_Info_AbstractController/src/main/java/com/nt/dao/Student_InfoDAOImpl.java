package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.StudentBO;

public class Student_InfoDAOImpl implements Student_InfoDAO {
	private static final String GET_ALL_STUDENT_INFO="SELECT NAME,RANK,SID FROM STUDENT_TAB1";
	private JdbcTemplate jt;
	public Student_InfoDAOImpl(JdbcTemplate jt) {
		System.out.println("-----------DAO---------------------------");
		this.jt = jt;
	}

	@Override
	public List<StudentBO> fetchRecords() {
		// TODO Auto-generated method stub
		List<StudentBO> listBO=null;
		listBO=jt.query(GET_ALL_STUDENT_INFO, new StudentExtrator());
		return listBO;
	}
	private class StudentExtrator implements ResultSetExtractor<List<StudentBO>>{

		@Override
		public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			StudentBO bo=null;
			List<StudentBO> listBO=null;
			listBO=new ArrayList<>();
			while (rs.next()) {
				bo=new StudentBO();
				bo.setName(rs.getString(1));
				bo.setRank(rs.getInt(2));
				bo.setId(rs.getInt(3));
				listBO.add(bo);
			}
			return listBO;
		}
		
	}  
 
}
