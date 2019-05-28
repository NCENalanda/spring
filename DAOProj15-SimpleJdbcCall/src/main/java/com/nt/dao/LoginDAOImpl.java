package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class LoginDAOImpl implements LoginDAO {
	private SimpleJdbcCall sjc;

	public LoginDAOImpl(SimpleJdbcCall sjc) {
		this.sjc = sjc;
	}

	@Override
	public Map<String, Object> authenticate(String user, String pwd) {
		Map<String,Object> inParams=null;
		Map<String,Object> outParams=null;
		//set PL/SQL Procedure name
		sjc.setProcedureName("p_authentication");
		//prepare Map having IN params
		inParams=new HashMap();
		inParams.put("USERR",user);
		inParams.put("PWD", pwd);
		//call PL/SQL procedure
		outParams=sjc.execute(inParams);
		System.out.println(outParams);
		return outParams;
	}

}
