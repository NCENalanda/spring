package com.nt.service;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public interface CollegeService {
	
	public String processStudent(StudentDTO dto);
	public String processEmployee(EmployeeDTO dto);

}
