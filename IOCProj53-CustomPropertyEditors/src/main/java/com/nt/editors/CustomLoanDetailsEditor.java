package com.nt.editors;

import java.beans.PropertyEditorSupport;

import com.nt.beans.LoanDetails;

public class CustomLoanDetailsEditor extends PropertyEditorSupport {

	 @Override
	public void setAsText(String text) throws IllegalArgumentException {
		 float pAmt=0.0f,rate=0.0f,time=0.0f;
		 LoanDetails details=null;
		 //get values from property (text)
		 pAmt=Float.parseFloat(text.substring(0,text.indexOf(',')));
		 time=Float.parseFloat(text.substring(text.indexOf(',')+1, text.lastIndexOf(',')));
		 rate=Float.parseFloat(text.substring(text.lastIndexOf(',')+1, text.length()));
		 System.out.println(pAmt+"  "+time+"  "+rate);
		 //create LoanDetails class object
		 details=new LoanDetails(pAmt,time,rate);
		 //set value to Property
		 setValue(details);
	}
}
