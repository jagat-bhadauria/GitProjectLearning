package com.mcnz.ws.example;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService
public class ScoreService {

	private static Score score = new Score();
	
	@WebMethod
	public Score getScore(){
		return score;
	}
	
	@WebMethod
	public Score updateScore(int wins, int losses, int ties){
		score.wins = wins;
		score.losses = losses;
		score.ties = ties;
		return score;
	}
	
	@WebMethod
	public int incrementWins(){	return ++score.wins;}
	@WebMethod
	public int incrementLosses(){	return ++score.losses;}
	@WebMethod
	public int incrementTies(){	return ++score.ties;}
	
		
}
