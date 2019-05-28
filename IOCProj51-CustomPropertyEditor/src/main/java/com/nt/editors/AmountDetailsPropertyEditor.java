package com.nt.editors;

import java.beans.PropertyEditorSupport;

import com.nt.beans.AmountDetails;

public class AmountDetailsPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("CustomPE:setAsTest(-)");
		float pAmt=0.0f,time=0.0f,rate=0.0f;
		AmountDetails details=null;
		pAmt=Float.parseFloat(text.substring(0,text.indexOf(",")));
		time=Float.parseFloat(text.substring(text.indexOf(",")+1, text.lastIndexOf(",")));
		rate=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
		System.out.println(pAmt+"   "+time+" "+rate);
		//create AmountDetails class obj
		details=new AmountDetails();
		details.setPamt(pAmt); details.setTime(time); details.setRate(rate);
		//set obj to property
		setValue(details);
	}
	
}
