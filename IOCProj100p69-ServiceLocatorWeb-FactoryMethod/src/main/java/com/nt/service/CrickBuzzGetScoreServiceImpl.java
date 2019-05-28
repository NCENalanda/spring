package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.external.ICCScoreComp;

@Service("cbzService")
public class CrickBuzzGetScoreServiceImpl implements CrickBuzzGetScoreService {
	 @Autowired
	private ICCScoreComp extService;

	

	@Override
	public String getScore(int mid) {// TODO Auto-generated method stub
		String scoreCard=null;
		//use Extenal Service 
		scoreCard=extService.fetchScore(mid);
		return scoreCard;
	}

}
