package com.techlab.contact;

public class Contact {
	private String firstname;
	private String lastname;
	private String mobileno;
	private double annulIncome;
	
	public Contact(){
		
	}
	public void setFirstName(String firstname){
		this.firstname=firstname;
		
	}
	public String getFirstName(){
		return firstname;
	}
	public void setLastName(String lastname){
		this.lastname=lastname;
	}
	public String getLastName(){
		return lastname;
	}
	public void setMobileNo(String mobileno){
	this.mobileno=mobileno;
	}
	public String getMobileno(){
		return mobileno;
		
	}
	public void setAnnulIncome(double annulIcome){
		this.annulIncome=annulIncome;
	}
	public double getAnnulIncome(){
		return annulIncome;
		
	}

}
