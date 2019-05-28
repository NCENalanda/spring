package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;
import com.nt.bo.EmployeeResultBO;

public interface EmployeeSearchDAO {
	public List<EmployeeResultBO>  search(EmployeeBO bo);

}
