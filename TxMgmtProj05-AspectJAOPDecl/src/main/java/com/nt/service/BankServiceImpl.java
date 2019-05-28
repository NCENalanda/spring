package com.nt.service;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {
	private BankDAO  dao;

	public BankServiceImpl(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean transferMoney(int srcAcno, int destAcno, int amount) throws IllegalAccessException{
		int count1=0,count2=0;
		
		
		/*//use DAO
		try{
			 Thread.sleep(11000);
		}
		catch(Exception e){ e.printStackTrace();}*/
		count1=dao.withdraw(srcAcno, amount);
		count2=dao.deposite(destAcno, amount);
		if(count1==0 || count2==0)
			//throw new RuntimeException("Problem in Transfering money..");
			//throw new IllegalAccessException("problem..");
			throw new  IllegalArgumentException("problem...");
		else
    		return true;
	}

}
