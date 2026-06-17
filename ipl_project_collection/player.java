package com.rw.entity;

public class player {

  private int jn;
  private String name;
  private int run;
  private int wickets;
  private String tname;
  
  public player() {
	  
	}
  
  

  public player(int jn, String name, int run, int wickets, String tname) {
	super();
	this.jn = jn;
	this.name = name;
	this.run = run;
	this.wickets = wickets;
	this.tname = tname;
}



  public int getJn() {
	return jn;
  }

  public void setJn(int jn) {
	this.jn = jn;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
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
	return "player [jn=" + jn + ", name=" + name + "]";
  }
  
  
}
