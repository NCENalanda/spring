package com.nt.target;

import java.util.Calendar;

public class BankLoanApprover {
	
	public String approveLoan(int loanId,String loanType,String manager){
		Calendar cal=null;
		int month=0;
		//get System Date
		cal=Calendar.getInstance();
		//get current  Month from SysDate
		month=cal.get(Calendar.MONTH);
		//approve or reject the loan
		if(month>=7 && month<=10 && loanType.equalsIgnoreCase("agri"))
			return  "Loan with loan Id="+loanId+" is approved by "+manager;
		else
			return  "Loan with loan Id="+loanId+" is rejected by "+manager;
	}

}
