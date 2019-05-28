package com.nt.service;

import java.util.List;

import com.nt.dto.DepartmentDTO;

public interface DepartmentService {
	public List<DepartmentDTO>  searchDeptsByDeptNos(int start,int end);
	public int  findDeptsCountByLocations(String city1,String city2);
	public String addDepartment(DepartmentDTO dto);

}
