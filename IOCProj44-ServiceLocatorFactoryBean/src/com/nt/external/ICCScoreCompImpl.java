package com.nt.external;

public class ICCScoreCompImpl implements ICCScoreComp {

	@Override
	public String getScore(int mid) {
		 if(mid==1001)
		     return "IND Vs PAK --> 220/1(IND)";
		 else if(mid==1002)
			 return "SA Vs AUS   ---> 10/10 (SA)";
		 else
			  throw new IllegalArgumentException("Invalid MatchId");
	}//

}
