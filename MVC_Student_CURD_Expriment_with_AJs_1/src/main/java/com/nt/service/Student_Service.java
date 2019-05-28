package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface Student_Service {
	
	public List<StudentDTO>  getAllRecords();
	public StudentDTO        get_Records_By_ID(int id);
	public String            updateInfo(StudentDTO dto);
	public String            deleteInfo(int id);
	public String            insertInfo(StudentDTO dto);

}
