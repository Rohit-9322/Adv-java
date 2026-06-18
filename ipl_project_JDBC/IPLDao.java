package com.rw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rw.entity.player;

public class IPLDao {
	
	private List<player> ipl_db = null;
	
	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/advjava_433_db";
	String un = "root";
	String pwd = "root";
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	String query = "select * from player";

	public List<player> getAllPlayer(){
		
		ipl_db = new ArrayList<>();
		
		try {
			Class.forName(path);
			
			conn = DriverManager.getConnection(url,un,pwd);
			
			 pst = conn.prepareStatement(query);
			 
			 rs = pst.executeQuery();
			 ipl_db = new ArrayList<player>();
			 
			 while(rs.next()) {
				 int pid = rs.getInt(1);
				 String pname = rs.getString(2);
				 int run = rs.getInt(3);
				 int wickets = rs.getInt(4);
				 String tname = rs.getString(5);
				 
				 player obj = new player(pid,pname,run,wickets,tname);
				 ipl_db.add(obj);
				 
			 }
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return ipl_db;
	}
	
	public List<player> getPlayersByTeam(String tname){

	    List<player> list = new ArrayList<>();

	    String query = "select * from player where tname=?";

	    try {

	        Class.forName(path);

	        conn = DriverManager.getConnection(url, un, pwd);

	        pst = conn.prepareStatement(query);

	        pst.setString(1, tname);

	        rs = pst.executeQuery();

	        while(rs.next()) {

	            int pid = rs.getInt(1);
	            String pname = rs.getString(2);
	            int run = rs.getInt(3);
	            int wickets = rs.getInt(4);
	            String team = rs.getString(5);

	            player p = new player(pid, pname, run, wickets, team);

	            list.add(p);
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}
}
