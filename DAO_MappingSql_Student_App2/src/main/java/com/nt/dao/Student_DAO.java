package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface Student_DAO {
	public List<StudentBO> fetchAllRecords();
	public int             insertInfo(StudentBO bo);
	public Object          getInfo(StudentBO bo);
	public int             updateInfo(StudentBO bo);
	public int             deleteInfo(int id);
}


