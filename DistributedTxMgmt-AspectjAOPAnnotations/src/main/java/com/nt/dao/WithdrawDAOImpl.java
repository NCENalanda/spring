package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("withdrawDAO")
public class WithdrawDAOImpl implements WithdrawDAO {
	private  static final String WITHDRAW_QUERY="UPDATE  DTX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?";
	
	@Autowired
	@Qualifier("template1")
  private JdbcTemplate jt;
	
	@Override
	public int withdraw(int acno, int amount) {
		int count=0;
		count=jt.update(WITHDRAW_QUERY,amount,acno);
		return count;
	}

}
