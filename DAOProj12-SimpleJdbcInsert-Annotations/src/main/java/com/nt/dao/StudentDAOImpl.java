package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;
@Repository("stDAO")
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private SimpleJdbcInsert sji;


	/*@Override
	public int insert(StudentBO bo) {
		Map<String,Object> map=null;
		int count=0;
		//set Table name
		sji.setTableName("Student");
		//prepare Map obj col names and col values
		map=new HashMap();
		map.put("sno",bo.getSno());
		map.put("sname",bo.getSname());
		map.put("sadd",bo.getSadd());
		//execute Query
		count=sji.execute(map);
		return count;
	}
*/
	@Override
	public int insert(StudentBO bo) {
			BeanPropertySqlParameterSource bpsps=null;
		int count=0;
		//set Table name
		sji.setTableName("Student");
		//prepare  obj having col names and col values
		bpsps=new BeanPropertySqlParameterSource(bo);
		//execute Query
		count=sji.execute(bpsps);
		return count;
	}

}
