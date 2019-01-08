package com.techlab.account;

public class Account implements Cloneable{
	private int accountNo;
	private String name;
	
	public Account(int accountNo,String name){
		this.accountNo=accountNo;
		this.name=name;
	}
	public int getAccountNo(){
		return accountNo;
	}
	public String getName(){
		return name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}

}
