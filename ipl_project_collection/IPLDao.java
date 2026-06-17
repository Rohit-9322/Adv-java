package com.rw.dao;

import java.util.ArrayList;
import java.util.List;

import com.rw.entity.player;

public class IPLDao {
	
	private List<player> ipl_db = null;

	public List<player> getAllPlayer(){
		
		ipl_db = new ArrayList<>();
		
		ipl_db.add(new player(18,"Virat Kohli",4557,1,"RCB"));
		ipl_db.add(new player(8,"Faf du Plessis",3890,0,"RCB"));
		ipl_db.add(new player(19,"Rajat Patidar",2105,0,"RCB"));
		ipl_db.add(new player(17,"Glenn Maxwell",3250,28,"RCB"));
		ipl_db.add(new player(21,"Dinesh Karthik",4100,0,"RCB"));
		ipl_db.add(new player(97,"Cameron Green",2800,45,"RCB"));
		ipl_db.add(new player(11,"Mahipal Lomror",1450,12,"RCB"));
		ipl_db.add(new player(32,"Karn Sharma",450,65,"RCB"));
		ipl_db.add(new player(56,"Mohammed Siraj",320,95,"RCB"));
		ipl_db.add(new player(22,"Yash Dayal",180,70,"RCB"));
		ipl_db.add(new player(44,"Lockie Ferguson",250,88,"RCB"));

		ipl_db.add(new player(7,"MS Dhoni",5200,0,"CSK"));
		ipl_db.add(new player(31,"Ruturaj Gaikwad",3750,0,"CSK"));
		ipl_db.add(new player(25,"Devon Conway",2980,0,"CSK"));
		ipl_db.add(new player(81,"Shivam Dube",2700,10,"CSK"));
		ipl_db.add(new player(10,"Ravindra Jadeja",2900,145,"CSK"));
		ipl_db.add(new player(75,"Moeen Ali",2100,58,"CSK"));
		ipl_db.add(new player(9,"Ajinkya Rahane",4300,1,"CSK"));
		ipl_db.add(new player(90,"Deepak Chahar",420,85,"CSK"));
		ipl_db.add(new player(27,"Tushar Deshpande",120,78,"CSK"));
		ipl_db.add(new player(91,"Matheesha Pathirana",60,95,"CSK"));
		ipl_db.add(new player(99,"Mustafizur Rahman",180,110,"CSK"));

		ipl_db.add(new player(45,"Rohit Sharma",6211,15,"MI"));
		ipl_db.add(new player(63,"Ishan Kishan",3450,0,"MI"));
		ipl_db.add(new player(33,"Suryakumar Yadav",3980,0,"MI"));
		ipl_db.add(new player(1,"Hardik Pandya",2450,72,"MI"));
		ipl_db.add(new player(77,"Tilak Varma",1850,2,"MI"));
		ipl_db.add(new player(23,"Tim David",1650,0,"MI"));
		ipl_db.add(new player(93,"Jasprit Bumrah",150,165,"MI"));
		ipl_db.add(new player(24,"Gerald Coetzee",210,82,"MI"));
		ipl_db.add(new player(41,"Piyush Chawla",620,185,"MI"));
		ipl_db.add(new player(16,"Naman Dhir",850,5,"MI"));
		ipl_db.add(new player(55,"Luke Wood",140,55,"MI"));

		ipl_db.add(new player(12,"Shubman Gill",4200,0,"GT"));
		ipl_db.add(new player(99,"Wriddhiman Saha",2600,0,"GT"));
		ipl_db.add(new player(3,"Sai Sudharsan",2400,0,"GT"));
		ipl_db.add(new player(5,"David Miller",3900,0,"GT"));
		ipl_db.add(new player(11,"Rahul Tewatia",1750,38,"GT"));
		ipl_db.add(new player(42,"Vijay Shankar",1450,15,"GT"));
		ipl_db.add(new player(7,"Rashid Khan",950,155,"GT"));
		ipl_db.add(new player(13,"Mohit Sharma",220,125,"GT"));
		ipl_db.add(new player(18,"Noor Ahmad",90,75,"GT"));
		ipl_db.add(new player(29,"Spencer Johnson",60,42,"GT"));
		ipl_db.add(new player(88,"Umesh Yadav",350,140,"GT"));
		
		return ipl_db;
	}
}
