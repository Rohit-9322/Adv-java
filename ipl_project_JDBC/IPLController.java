package com.rw.controller;

//import java.util.List;

import com.rw.entity.player;
import com.rw.service.IPLService;

public class IPLController {

	public static void main(String[] args) {
		
		IPLService iplservice = new IPLService();
		
		// THAT FOR ALL PLAYER 
		// List<player> allPlayers = iplservice.getAllPlayers();
		// allPlayers.forEach(p -> System.out.println(p.getPname()));
		
		//Team Wise Players
	     // List<player> teamPlayers = iplservice.getPlayersByTeam("CSK");
         // teamPlayers.forEach(System.out::println);
		
		
		// Insert player 
//		player p = new player(101,"Rohit Wankhade",6500,55,"MI");
//        boolean result = iplservice.addPlayer(p);
//        System.out.println(result);
        
        // update 
        player p = new player(101,"Rohit patil",7500,55,"MI");

        		boolean result = iplservice.updatePlayer(p);

        		System.out.println(result);
		
		
		 
		 
		
		

	}
}
