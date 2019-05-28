package com.nt.aspect;

import com.nt.bo.UserDetails;
import com.nt.dao.AuthenticateDAO;

public class AuthenticationManager {
	private AuthenticateDAO dao;
	private ThreadLocal<UserDetails> tLocal=new ThreadLocal();
	
	public AuthenticationManager(AuthenticateDAO dao) {
		this.dao = dao;
	}
	
	public void singnIn(String username,String password){
		UserDetails details=null;
		//create UserDetails object
		details=new UserDetails();
		details.setUsername(username); details.setPassword(password);
		tLocal.set(details);
	}
	
	public void signOut(){
		tLocal.remove();
	}
	
	public boolean validate(){
		UserDetails details=null;
		int count=0;
		//get UserDetails class object
		details=tLocal.get();
		// use DAO
		count=dao.validate(details);
		if(count==0)
			return false;
		else
			return true;
	}
}//class
