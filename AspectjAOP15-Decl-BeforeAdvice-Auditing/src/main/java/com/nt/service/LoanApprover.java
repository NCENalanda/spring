package com.nt.service;

public class LoanApprover {
	
	public  String approveLoan(int loanId,String loanType,String manager){
		
		if(loanType.equalsIgnoreCase("agri")){
			return loanId+" loan  approved  by "+manager +" loan type is"+loanType;
		}
		else{
			return loanId+" loan  rejected  by "+manager +" loan type is"+loanType;
		}
		
	}//method
}//class
