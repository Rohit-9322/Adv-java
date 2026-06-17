package com.rw.controller;

import java.util.List;

import com.rw.entity.player;
import com.rw.service.IPLService;

public class IPLController {

	public static void main(String[] args) {
		
		IPLService iplservice = new IPLService();
		
		// THAT FOR ALL PLAYER 
		
		 List<player> allPlayers = iplservice.getAllPlayers();
		 
		 allPlayers.forEach(p -> System.out.println(p.getName()));
		
		// Team wise List 
//		List<player> rcbplayers = iplservice.getPlayersByTeam("RCB");
//		rcbplayers.forEach(System.out::println);
	}
}
