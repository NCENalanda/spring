package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public  List<EmployeeDTO>  searchEmpsByDesgs(String desg1,String desg2);
    public  EmployeeDTO  searchEmpByNo(int no);
    public String  registerEmp(EmployeeDTO dto);
}
