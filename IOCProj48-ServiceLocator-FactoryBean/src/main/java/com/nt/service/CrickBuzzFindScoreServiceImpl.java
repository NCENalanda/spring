package com.nt.service;

import com.nt.external.ICCScoreComp;

public class CrickBuzzFindScoreServiceImpl implements CrickBuzzFindScoreService {
	private ICCScoreComp extService;

	public void setExtService(ICCScoreComp extService) {
		this.extService = extService;
	}

	@Override
	public String findScore(int mid) throws IllegalStateException {
        String result=null;
		//use External Service
		result=extService.getScore(mid);
		return result;
	}

}
