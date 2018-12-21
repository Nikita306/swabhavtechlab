package com.techlab.account;

public abstract class Account {
	private String name;
	protected double balance;
	private int accountNo;

	public Account(String name, double balance, int accountNo) {
		this.name = name;
		this.balance = balance;
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;

	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNo() {
		return accountNo;

	}

	public void deposite(int amount) {
		this.balance = this.balance + amount;
	}

	public abstract void withdrwal(int amount);

	@Override
	public String toString() {
		return String.format("Name=" + this.getName() + "\t" + "Balance="
				+ this.getBalance() + "\t" + "AccountNumber="
				+ this.getAccountNo());
	}

}
