package com.rw.controller;

import java.util.List;

import com.rw.entity.player;
import com.rw.service.IPLService;

public class IPLController {

	public static void main(String[] args) {
		
		IPLService iplservice = new IPLService();
		
		// THAT FOR ALL PLAYER 
		
//		 List<player> allPlayers = iplservice.getAllPlayers();
//		 
//		 allPlayers.forEach(p -> System.out.println(p.getName()));
		
		//eam Wise Players
		List<player> teamPlayers = iplservice.getPlayersByTeam("CSK");

	    teamPlayers.forEach(System.out::println);
		
		

	}
}
