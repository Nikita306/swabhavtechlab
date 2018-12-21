package com.techlab.account;

public class Account {
	private static final double MIM_BALANCE;
	private static int autogenratedAccNo;
	private int accno;
	private String name;
	private double balance;
	private boolean isActive;
	private static int transactionCount;
	static{
		MIM_BALANCE=500;
		autogenratedAccNo=101;
		transactionCount=0;
		
	}

	public Account(String name, double balance, boolean isActive) {
		this.name = name;
		this.balance = balance;
		this.isActive = isActive;
		accno = autogenratedAccNo++;
	}

	public Account(String name, double balance) {
		this(name, balance, false);

	}

	public int getAccno() {
		return accno;

	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsActive() {
		return isActive;

	}

	public void balanceDeposit(int amount) {
		this.balance = this.balance + amount;
		transactionCount++;
		

	}

	public void balanceWithdraw(int amount) {
		if (this.balance - amount > this.MIM_BALANCE) {
			this.balance = this.balance - amount;
			transactionCount++;
		}

	}

	public static int getTransactionCount() {
		return transactionCount;
		

	}

	@Override
	public String toString() {

		return String.format("AccountNo=" + this.getAccno() + "\t" + "Name="
				+ this.getName() + "\t" + "Balance=" + this.getBalance() + "\t"
				+ "IsActive=" + this.getIsActive());
		
	}


}
