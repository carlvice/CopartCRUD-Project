package com.copart.webservices.rest.jersey;

import java.util.ArrayList;

//registerations for user currently logged in
public class Registeration {
	
	private int gameId;
	private ArrayList<Integer> team ;
	
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public ArrayList<Integer> getTeam() {
		return team;
	}
	public void setTeam(ArrayList<Integer> team) {
		this.team = team;
	}

}