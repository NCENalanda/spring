package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.StudentBO;


public class ListStudentDAOImpl implements ListStudent_InfoDAO {
	private static final String GET_ALL_STUDENT_INFO="SELECT NAME,RANK,SID FROM STUDENT_TAB1";
	private static final String GET_NAME_STUDENT_BY_SID="SELECT * FROM STUDENT_TAB1 WHERE SID=1100";
	private JdbcTemplate jt;
	

	public ListStudentDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}
	public String getName(int sid) {
		// TODO Auto-generated method stub
		String name=null;
		StudentBO bo=null;
		bo=jt.queryForObject(GET_NAME_STUDENT_BY_SID, new StudentRowMapper());
				
		System.out.println(bo.toString());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		ArrayList<StudentBO> list=(ArrayList<StudentBO>) jt.query(GET_ALL_STUDENT_INFO, new StudentExtrator());
		System.out.println(list.toString());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		return bo.getName();
	}//close getName()
	
	private class StudentRowMapper implements RowMapper<StudentBO>{

		public StudentBO mapRow(ResultSet rs, int arg1) throws SQLException {
			System.out.println("---------------RowMapper---------------------------- ");
			StudentBO ebo=null;
			ebo=new StudentBO(rs.getString(1),rs.getInt(2),rs.getInt(3));
			// TODO Auto-generated method stub
			return ebo;
		}//close mapRow
		
	}//closeStudentRowMappe
	private class StudentExtrator implements ResultSetExtractor<List<StudentBO>>{

		public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
						StudentBO bo=null;
						List<StudentBO> listBO=null;
						listBO=new ArrayList<StudentBO>();
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
