package com.techlab.contactstore;

import java.io.Serializable;

public class Contact implements Serializable {
	
	private String fname;
	private String lname;
	private String phoneNo;
	
	public Contact(String fname,String lname,String phoneNo){
		this.fname=fname;
		this.lname=lname;
		this.phoneNo=phoneNo;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Contact() {
	}

	public String getFname(){
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	

}
