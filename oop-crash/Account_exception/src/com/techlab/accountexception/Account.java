package com.techlab.accountexception;

public class Account {
	private String name;
	private int accountNo;
	private double balance;

	public Account(String name, int accountNo, double balance) {
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;

	}

	public void depositeAmmount(double ammount) {
		this.balance = this.balance + ammount;

	}

	public void withdrawlAmmount(double ammount)  {
		if (this.balance - ammount > 500) {
			this.balance = this.balance - ammount;
		} else {
			throw new InSuffectiontFundException(this,ammount);
		}
	}

	@Override
	public String toString() { 
		return String.format("Name=" + this.getName() + "\t" + "AccountNumber="
				+ this.getAccountNo() +"\t "+"Balance=" + this.getBalance());

	}
}