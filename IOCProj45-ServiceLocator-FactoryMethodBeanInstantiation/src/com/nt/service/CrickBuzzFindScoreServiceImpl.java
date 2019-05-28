package com.nt.service;

import com.nt.external.ICCScoreComp;

public class CrickBuzzFindScoreServiceImpl implements CrickBuzzFindScoreService {
    private  ICCScoreComp extComp;
    
	public void setExtComp(ICCScoreComp extComp) {
		this.extComp = extComp;
	}

	@Override
	public String findScore(int mid) {
		return extComp.getScore(mid);
	}

}
