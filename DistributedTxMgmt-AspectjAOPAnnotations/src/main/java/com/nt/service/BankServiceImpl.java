package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.DepositeDAO;
import com.nt.dao.WithdrawDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	private WithdrawDAO wDAO;
	@Autowired
	private DepositeDAO  dDAO;

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean transferMoney(int srcAcno, int destAcno, int amt) {
         int count1=0,count2=0;
         boolean flag=false;
         count1=wDAO.withdraw(srcAcno, amt);
         count2=dDAO.deposite(destAcno,amt);
         if(count1==0 || count2==0){
        	  flag=false;
        	 throw new RuntimeException();
         }
         else{
        	 flag=true;
         }
         return flag;
         		
	}

}
