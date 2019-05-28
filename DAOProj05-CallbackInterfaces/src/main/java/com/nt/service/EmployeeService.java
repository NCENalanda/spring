package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public  EmployeeDTO  findEmpDetialsByNo(int eno);
	public List<EmployeeDTO> findEmpDetailsByDesg(String desg);

}
