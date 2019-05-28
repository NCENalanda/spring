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

public class StudentDAOImpl implements StudentDAO {
	private static final String  GET_ALL_STUDENTS="SELECT  SNO,SNAME,SADD,COURSE FROM SFC_STUDENT";
	private static final String  GET_STUDENT_BY_SNO="SELECT  SNO,SNAME,SADD,COURSE FROM SFC_STUDENT WHERE SNO=?";
	private static final String  UPDATE_STUDENT_BY_SNO="UPDATE SFC_STUDENT SET SNAME=?,SADD=?,COURSE=? WHERE SNO=?";
	private static final String  DELETE_STUDENT_BY_SNO="DELETE FROM SFC_STUDENT WHERE SNO=?";
	private JdbcTemplate jt;

	public StudentDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<StudentBO> getAllStudents() {
		List<StudentBO> listBO=null;
		listBO=jt.query(GET_ALL_STUDENTS,new StudentExtractor());
		return listBO;
	}
	private class StudentExtractor implements ResultSetExtractor<List<StudentBO>>{

		@Override
		public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
		  List<StudentBO> listBO=null;
		  StudentBO bo=null;
		  listBO=new ArrayList();
		  while(rs.next()){
			  bo=new StudentBO();
			  bo.setSno(rs.getInt(1));
			  bo.setSname(rs.getString(2));
			  bo.setSadd(rs.getString(3));
			  bo.setCourse(rs.getString(4));
			  listBO.add(bo);
		  }//while
			return listBO;
		}
		
	}
	@Override
	public StudentBO getStudentBySno(int sno) {
		StudentBO bo=null;
		bo= jt.queryForObject(GET_STUDENT_BY_SNO, new StudentMapper(), sno);
		return bo;
	}
	
	@Override
	public int updateStudent(StudentBO bo) {
		int count=0;
		count=jt.update(UPDATE_STUDENT_BY_SNO, bo.getSname(),bo.getSadd(),bo.getCourse(),bo.getSno());
		return count;
	}
	
	@Override
	public int deleteStudent(int sno) {
		int count=0;
		count=jt.update(DELETE_STUDENT_BY_SNO, sno);
		return count;
	}
	
	private class StudentMapper implements  RowMapper<StudentBO>{

		@Override
		public StudentBO mapRow(ResultSet  rs, int index) throws SQLException {
			StudentBO bo=null;
			 //copy rs obj record to BO clas obj
			bo=new StudentBO();
			bo.setSno(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setCourse(rs.getString(4));
			bo.setSadd(rs.getString(3));
			return bo;
		}
	}//class
	
	
	

}
