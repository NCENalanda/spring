package com.nt.dao;

public interface BankDAO {
	public int  withdraw(int acno,int amount);
	public int  deposite(int acno,int amount);

}
