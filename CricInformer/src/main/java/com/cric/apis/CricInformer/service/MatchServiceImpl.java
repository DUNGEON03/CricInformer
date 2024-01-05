package com.cric.apis.CricInformer.service;

import java.util.List;
import java.util.Map;

import com.cric.apis.CricInformer.entities.Match;
import com.cric.apis.CricInformer.repositories.MatchRepo;

public class MatchServiceImpl implements MatchService{
	
	private MatchRepo matchRepo;
	
	public MatchServiceImpl(MatchRepo matchRepo) {
		// TODO Auto-generated constructor stub
		this.matchRepo=matchRepo;
	}
	
	
	//all match history in db
	@Override
	public List<Match> getAllMatches() {
		// TODO Auto-generated method stub
		return this.matchRepo.findAll();
	}

	@Override
	public List<Match> getLiveMatches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> getPointTable() {
		// TODO Auto-generated method stub
		return null;
	}

}
