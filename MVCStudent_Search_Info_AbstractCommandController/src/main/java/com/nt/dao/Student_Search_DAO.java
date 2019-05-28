package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface Student_Search_DAO {
	public List<StudentBO> search(StudentBO bo);

}
