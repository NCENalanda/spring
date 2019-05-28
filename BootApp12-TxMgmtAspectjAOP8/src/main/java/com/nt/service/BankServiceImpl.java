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
	@Transactional(propagation=Propagation.REQUIRED,transactionManager="dsTxMgmr")
	public boolean transferMoney(int srcAcno, int destAcno, int amount){
		int count1=0,count2=0;
		//use DAO
		count1=dao.withdraw(srcAcno, amount);
		count2=dao.deposite(destAcno, amount);
		if(count1==0 || count2==0)
			throw new RuntimeException("Problem in Transfering money..");
		else
    		return true;
	}

}
