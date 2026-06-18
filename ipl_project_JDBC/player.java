package com.rw.entity;

public class player {

  private int pid;
  private String pname;
  private int run;
  private int wickets;
  private String tname;
  
  public player() {
	  
	}
  
  

  public player(int pid, String pname, int run, int wickets, String tname) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.run = run;
	this.wickets = wickets;
	this.tname = tname;
}



  public int getJn() {
	return pid;
  }

  public void setJn(int pid) {
	this.pid = pid;
  }

  public String getName() {
	return pname;
  }

  public void setName(String pname) {
	this.pname = pname;
  }

  public int getRun() {
	return run;
  }

  public void setRun(int run) {
	this.run = run;
  }

  public int getWickets() {
	return wickets;
  }

  public void setWickets(int wickets) {
	this.wickets = wickets;
  }

  public String getTname() {
	return tname;
  }

  public void setTname(String tname) {
	this.tname = tname;
  }

  @Override
  public String toString() {
	return "player [pid=" + pid + ", pname=" + pname + "]";
  }
  
  
}
