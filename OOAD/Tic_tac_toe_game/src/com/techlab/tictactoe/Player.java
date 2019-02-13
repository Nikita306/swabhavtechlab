package com.techlab.tictactoe;

public class Player {
	private String fname;
	private String lname;
	private MarkType mark;;
	
	public Player(String fname,String lname,MarkType mark){
		this.fname=fname;
		this.lname=lname;
		this.mark=mark;
	}

	public Player() {
	}

	public void SetMark(MarkType mark){
		this.mark=mark;
	}
	public MarkType getMark(){
		return mark;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

}
