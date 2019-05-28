package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface Student_DAO {
	public List<StudentBO> fetchAllRecords();
	public int             insertInfo(StudentBO bo);
	public StudentBO       getInfo_By_ID(int id);
	public int             updateInfo(StudentBO bo);
	public int             deleteInfo(int id);
}


