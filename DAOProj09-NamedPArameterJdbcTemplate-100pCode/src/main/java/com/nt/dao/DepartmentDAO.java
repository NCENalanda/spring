package com.nt.dao;

import java.util.List;

import com.nt.bo.DepartmentBO;

public interface DepartmentDAO {
	public List<DepartmentBO> getDeptDetialsByDeptNo(int start,int end);
	public int getDeptCountByLocations(String location1,String location2);
	public int registerDepartment(DepartmentBO bo);

}
