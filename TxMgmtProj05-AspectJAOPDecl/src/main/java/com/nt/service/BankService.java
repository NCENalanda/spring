package com.nt.service;

public interface BankService {
	public  boolean transferMoney(int srcAcno,int destAcno,int amount)throws  IllegalAccessException;

}
