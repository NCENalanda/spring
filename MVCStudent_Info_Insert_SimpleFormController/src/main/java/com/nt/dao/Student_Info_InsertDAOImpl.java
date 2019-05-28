package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class Student_Info_InsertDAOImpl implements Student_Info_InsertDAO {
	private static final String INSERT_STUDENT_INFO="INSERT INTO STUDENT_TAB1(NAME,RANK,SID) VALUES(?,?,SEQ_SID.NEXTVAL)";
	private JdbcTemplate jt;
	public Student_Info_InsertDAOImpl(JdbcTemplate jt) {
		// TODO Auto-generated constructor stub
		this.jt=jt;
	}

	@Override
	public int insert(StudentBO bo) {
		// TODO Auto-generated method stub
		int i=jt.update(INSERT_STUDENT_INFO,bo.getName(),bo.getRank());
		
		return i;
	}

}
