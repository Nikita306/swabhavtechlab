package com.techlab.account;

public class SavingAccount extends Account{
	private static final double MIM_BALANCE;
	static {
		MIM_BALANCE = 500;
	}

	public SavingAccount(String name, double balance, int accountNo) {
		super(name, balance, accountNo);
	}
	@Override
	public void withdrwal(int amount) {
	if(	this.balance-amount>this.MIM_BALANCE){
		this.balance=this.balance-amount;
	}
		
		
	}
	

}
