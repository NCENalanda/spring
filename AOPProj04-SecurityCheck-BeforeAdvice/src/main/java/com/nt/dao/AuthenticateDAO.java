package com.nt.dao;

import com.nt.bo.UserDetails;

public interface AuthenticateDAO {
	public int  validate(UserDetails details);

}
