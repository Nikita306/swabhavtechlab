package com.techlab.customer;

public class Customer {
	public String firstName;
	public String lastName;
	private int age;
	private int id;

	public void canYouChangeAge(int newage) {
		if (newage > 18 && newage < 30) {
			age= newage;
		}
		
	}
	
	public int canYouReturnAge(){
		return age;
	}
	
	public void canYouChangeId(int newId){
		if(newId>0){
			id=newId;
		}
	}
	
	public int canYoureturnId(){
		return id;
	}

}

/*
 * public Customer(String firstName1 ,String lastName1 ,int age1 ,int id1){
 * this.firstName=firstName1; this.lastName=lastName1; this.age=age1;
 * this.id=id1; }
 */

