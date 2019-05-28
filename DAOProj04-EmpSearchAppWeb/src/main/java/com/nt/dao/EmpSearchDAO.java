package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmpSearchDAO {
	public List<Map<String,Object>>  findEmpsByDesgs(String cond);

}
