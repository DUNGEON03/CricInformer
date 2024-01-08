package com.cric.apis.CricInformer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cric.apis.CricInformer.entities.Match;
import com.cric.apis.CricInformer.service.MatchService;

@RestController
@RequestMapping("/match")

public class MatchController {
	
	private MatchService matchService;
	 public MatchController(MatchService matchService) {
	        this.matchService = matchService;
	    }
	
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new ResponseEntity<>(this.matchService.getLiveMatches(),HttpStatus.OK);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
		
	}
	
	@GetMapping("/pointTable")
	public ResponseEntity<List<List<String>>> getPointTable(){
		return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
		
	}

}
