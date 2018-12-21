package com.techlab.serialization;

import java.io.Serializable;

public class Account implements Serializable {
	private String name;
	private double balance;
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

}
