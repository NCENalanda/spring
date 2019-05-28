package com.nt.dao;

public interface BankDAO {
	public  int  updateBalnace(int acno,float newBalance);
	public  float  getBalance(int acno);

}
