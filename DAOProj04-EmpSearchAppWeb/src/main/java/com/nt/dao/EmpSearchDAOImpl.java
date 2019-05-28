package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpSearchDAOImpl implements EmpSearchDAO {
    private JdbcTemplate jt;
    
	public EmpSearchDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<Map<String, Object>> findEmpsByDesgs(String cond) {
		List<Map<String,Object>> list=null;
		list=jt.queryForList("SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN "+cond+" ORDER BY JOB");
		return list;
	}

}
