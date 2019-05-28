package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface Student_DAO {
	public List<StudentBO> fetchAllRecords();
	public String   insertInfo(StudentBO bo);
	public Object   searchInfo(StudentBO bo);
	public String   updateInfo(StudentBO bo);
	public String   deleteInfo(StudentBO bo);
}


