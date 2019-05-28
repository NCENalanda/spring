package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.BankDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDAO  dao;

	

	@Override
	@Transactional(timeout=20,propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=java.lang.IllegalAccessException.class, noRollbackFor=NumberFormatException.class)
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
