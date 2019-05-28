package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO {
	private static final String  WITHDRAW_QUERY="UPDATE BANK_ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?";
	private static final String  DEPOSITE_QUERY="UPDATE BANK_ACCOUNT SET BALANCE=BALANCE+? WHERE ACNO=?";
		
	private JdbcTemplate jt;
	public BankDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int withdraw(int acno, int amount) {
		 int count=0;
		 count=jt.update(WITHDRAW_QUERY,amount,acno);
		return count;
	}

	@Override
	public int deposite(int acno, int amount) {
		 int count=0;
		 count=jt.update(DEPOSITE_QUERY,amount,acno);
		return count;	
		}

}
