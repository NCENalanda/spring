package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.UserDetails;

public class AuthenticateDAOImpl implements AuthenticateDAO {
	private static final String AUTH_QUERY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PASS=?";
	private JdbcTemplate jt;

	public AuthenticateDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int validate(UserDetails details) {
	  int  count=0;
	  count=jt.queryForObject(AUTH_QUERY,Integer.class,details.getUsername(),details.getPassword());
		return count;
	}

}
