package com.nt.service;

import com.nt.dao.BankDAO;

public class BankService {
	private BankDAO dao;

	public BankService(BankDAO dao) {
		this.dao = dao;
	}

	public boolean withdraw(int acno, float amt) throws Exception{
		float bal=0.0f;
		int count=0;
		//get Balance 
		bal=dao.getBalance(acno);
		//update balance
		bal=bal-amt;
		//use DAO
		count=dao.updateBalnace(acno, bal);
		if(count==0)
			return false;
		else
			return true;
	}

	public boolean deposite(int acno, float amt)throws Exception {
		float bal=0.0f;
		int count=0;
		//get Balance 
		bal=dao.getBalance(acno);
		//update balance
		bal=bal+amt;
		//use DAO
		count=dao.updateBalnace(acno, bal);
		if(count==0)
			return false;
		else
			return true;
	}

}
