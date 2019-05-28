package com.nt.external;

public class ICCScoreCompImpl implements ICCScoreComp {

	@Override
	public String fetchScore(int mid) {
		if(mid==1001)
		   return "IND(b) Vs PAK:: 399/1";
		else if(mid==1002)
			return "AUS (b) Vs ENG:: 266/4";
		else
			return "No Cricket Match found";
	}

}
