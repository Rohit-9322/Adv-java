package com.rw.service;

import java.util.List;

import com.rw.dao.IPLDao;
import com.rw.entity.player;

public class IPLService {

	private IPLDao ipldao = null;
	
	//private IPLDao ipldao = new IPLDao();

	// THAT GIVE ALL PLEAR NAME 
	
	public List<player> getAllPlayers() {

		ipldao = new IPLDao();

		List<player> ipl_db=  ipldao.getAllPlayer();

		return ipl_db;
	}
	
	
//	public List<player> getPlayersByTeam(String teamName){
//		
//		ipldao = new IPLDao();
//		
//		List<player> allPlayers = ipldao.getAllPlayer();
//		
//		return allPlayers.stream()
//				.filter(p -> p.getTname().equalsIgnoreCase(teamName))
//				.toList();
//	}
}
