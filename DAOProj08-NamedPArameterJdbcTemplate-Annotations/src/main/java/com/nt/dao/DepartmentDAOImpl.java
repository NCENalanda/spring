package com.nt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.DepartmentBO;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
	private static final String  GET_DEPTS_BY_DEPTNOS="SELECT DEPTNO,DNAME,LOC FROM DEPT WHERE DEPTNO>=:min AND DEPTNO<=:max";
	private static final String  GET_DEPTSCOUNT_BY_LOCATIONS="SELECT COUNT(*) FROM DEPT WHERE LOC IN(:loc1,:loc2)";
	private static final String  INSERT_DEPARTMENT="INSERT INTO DEPT(DEPTNO,DNAME,LOC) VALUES(:deptNo,:deptName,:location)";
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	



	@Override
	public List<DepartmentBO> getDeptDetialsByDeptNo(int start, int end) {
		Map<String,Object> map=null;
		List<DepartmentBO> listBO=new ArrayList();
	     //Prepare Map Object having Query params	
		map=new HashMap();
		map.put("min", start);
		map.put("max", end);
		//execute the Query
		npjt.query(GET_DEPTS_BY_DEPTNOS, map,rs->{
			DepartmentBO bo=new DepartmentBO();
			 //copy ResultSet Object record to BO obj
			bo.setDeptNo(rs.getInt(1));
			bo.setDeptName(rs.getString(2));
			bo.setLocation(rs.getString(3));
			listBO.add(bo);
		});
		return listBO;
	}
	@Override
	public int getDeptCountByLocations(String location1, String location2) {
		MapSqlParameterSource map=null;
	     int count=0;
		//pepare Params
		map=new  MapSqlParameterSource();
		map.addValue("loc1",location1);
		map.addValue("loc2",location2);
		//execute the query
          count=npjt.queryForObject(GET_DEPTSCOUNT_BY_LOCATIONS, map,Integer.class);
		return count;
	}
	
	@Override
	public int registerDepartment(DepartmentBO bo) {
		BeanPropertySqlParameterSource source=null;
		int count=0;
	  //prepare params
		source=new BeanPropertySqlParameterSource(bo);
		//execute Query
		count=npjt.update(INSERT_DEPARTMENT, source);
		return count;
	}

}
