package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentInsertDAOImpl implements StudentInsertDAO {
	private  static final String  STUDENT_INSERT_QUERY="INSERT INTO SFC_STUDENT VALUES(SFC_SNO_SEQ.NEXTVAL,?,?,?)";
	
	private JdbcTemplate jt;

	public StudentInsertDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(StudentBO bo) {
	    int count=0;
	    count=jt.update(STUDENT_INSERT_QUERY,bo.getSname(),bo.getSadd(),bo.getCourse());
		return count;
	}

}
