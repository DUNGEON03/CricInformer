package com.cric.apis.CricInformer.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cric.apis.CricInformer.entities.Match;

public interface MatchRepo extends JpaRepository<Match,Integer>{

	//fetch match using team name
	
	Optional<Match> findByTeamHeading(String teamHeading);
	
}
