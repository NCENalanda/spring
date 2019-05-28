package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO {
   private static final String  UPDATE_ACCOUNT_BALANCE="UPDATE SPRING_ACCOUNT SET BALANCE=? WHERE ACNO=?";
   private static final  String  GET_ACCOUNT_BALANCE="SELECT BALANCE FROM SPRING_ACCOUNT WHERE ACNO=?";

   private JdbcTemplate jt;
	
	public BankDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int updateBalnace(int acno, float newBalance) {
      int count=0;
      count=jt.update(UPDATE_ACCOUNT_BALANCE, newBalance,acno);
		return count;
	}

	@Override
	public float getBalance(int acno) {
		float balance=0;
		balance=jt.queryForObject(GET_ACCOUNT_BALANCE, Float.class,acno);
		return balance;
	}

}
