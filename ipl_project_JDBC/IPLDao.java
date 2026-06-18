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
	
	private String path = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/advjava_433_db";
	private String un = "root";
	private String pwd = "root";
	
	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	
	private String query = "select * from player";

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
	
	// Team wise player 
	
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
	
	// Insert player 
	private String insert_query = "insert into player values(?,?,?,?,?)";

	public boolean addPlayer(player p) {
          try {

	        conn = DriverManager.getConnection(url, un, pwd);

	        pst = conn.prepareStatement(insert_query);

	        pst.setInt(1, p.getPid());
	        pst.setString(2, p.getPname());
	        pst.setInt(3, p.getRun());
	        pst.setInt(4, p.getWickets());
	        pst.setString(5, p.getTname());

	        int row = pst.executeUpdate();

	        if(row > 0) {
	            return true;
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return false;
	}
	
	// Update player 
	private String update_query = "update player set pname=?, runs=?, wickets=?, tname=? where pid=?";

	public boolean updatePlayer(player p) {
       try {

	        conn = DriverManager.getConnection(url, un, pwd);

	        pst = conn.prepareStatement(update_query);

	        pst.setString(1, p.getPname());
	        pst.setInt(2, p.getRun());
	        pst.setInt(3, p.getWickets());
	        pst.setString(4, p.getTname());
	        pst.setInt(5, p.getPid());

	        int row = pst.executeUpdate();

	        if(row > 0) {
	            return true;
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return false;
	}
}
