package com.techlab.interfaceexample;

public class CurrentAccount implements Account,Account2 {
	Account a=new CurrentAccount();
	Account aa=new SavingAccount();
	

	@Override
	public void deposite(double amount) {
		amount=a.balance+amount;
		System.out.println(amount);
		
	}

	@Override
	public void withdrawl(double amount) {
		amount=aa.balance-amount;
		System.out.println(amount);
	}

	
}
