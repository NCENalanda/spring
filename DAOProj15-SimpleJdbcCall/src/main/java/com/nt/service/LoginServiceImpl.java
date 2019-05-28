package com.nt.service;

import java.util.Map;

import com.nt.dao.LoginDAO;

public class LoginServiceImpl implements LoginService {
   private LoginDAO dao;
   
	public LoginServiceImpl(LoginDAO dao) {
	super();
	this.dao = dao;
}

	@Override
	public String validate(String user, String pwd) {
		Map<String,Object> outParams=null;
		//use DAO
		outParams=dao.authenticate(user, pwd);
		//Convert OutParams(Map) to String
		return (String)outParams.get("RESULT");
	}

}
