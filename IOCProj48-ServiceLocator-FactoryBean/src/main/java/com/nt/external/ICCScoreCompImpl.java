package com.nt.external;

public class ICCScoreCompImpl implements ICCScoreComp {

	@Override
	public String getScore(int mid) throws IllegalStateException {
		if(mid==1001)
		  return "IND Vs RSA--> 450/7 (ind)";
		else if(mid==1002)
			return "IND Vs PAK --->233/1(ind)";
		else 
			throw new IllegalStateException("Wrrong match id");
	}

}
