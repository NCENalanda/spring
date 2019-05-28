package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeSearchService {
	public  List<EmployeeDTO> searchEmpsByDesg(String[] desgs)throws Exception;

}
