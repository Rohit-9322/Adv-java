package com.rw.service;

import java.util.List;

import com.rw.dao.IPLDao;
import com.rw.entity.player;

public class IPLService {

	private IPLDao ipldao = null;
	
	
	// THAT GIVE ALL PLEAR NAME 
	public List<player> getAllPlayers() {

		ipldao = new IPLDao();

		List<player> ipl_db=  ipldao.getAllPlayer();

		return ipl_db;
	}
	
	
	// get team wise player 
	public List<player> getPlayersByTeam(String tname) {

	    ipldao = new IPLDao();

	    return ipldao.getPlayersByTeam(tname);
	}
	
	
	// Insert player 
	public boolean addPlayer(player p) {

	    ipldao = new IPLDao();

	    return ipldao.addPlayer(p);
	}

	
	// update player 
	public boolean updatePlayer(player p) {

	    ipldao = new IPLDao();

	    return ipldao.updatePlayer(p);
	}

}
