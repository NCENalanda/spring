package com.nt.dao;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;
import com.nt.log.FactoryLog;

public class Student_Info_InsertDAOImpl implements Student_Info_InsertDAO {
	//query
	private static final String INSERT_STUDENT_INFO="INSERT INTO STUDENT_TAB1(NAME,RANK,SID) VALUES(?,?,SEQ_SID.NEXTVAL)";
	private static Logger log=FactoryLog.getLogger();
	
	private JdbcTemplate jt;
	public Student_Info_InsertDAOImpl(JdbcTemplate jt) {
		// TODO Auto-generated constructor stub
		log.debug(" 0-param constrator");
		this.jt=jt;
		log.info("initialized the JdbcTemplate");
	}

	@Override
	public int insert(StudentBO bo) {
		// TODO Auto-generated method stub
		log.debug(" insert(StudentBO bo) ");
		int i=jt.update(INSERT_STUDENT_INFO,bo.getName(),bo.getRank());
		log.info("return the value");
		return i;
	}

}
