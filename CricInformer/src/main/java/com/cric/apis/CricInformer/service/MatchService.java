package com.cric.apis.CricInformer.service;

import java.util.List;
import java.util.Map;

import com.cric.apis.CricInformer.entities.Match;

public interface MatchService {
	
	//get all matches
	
	List<Match> getAllMatches();
	
	//get live matches
	List<Match> getLiveMatches();
	//get point table
	List<Map<String,String>> getPointTable();
}
