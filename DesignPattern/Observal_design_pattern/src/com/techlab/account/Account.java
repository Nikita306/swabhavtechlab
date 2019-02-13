package com.techlab.account;

import java.awt.List;
import java.util.ArrayList;

public class Account {
	private int accountNo;
	private String name;
	private double balance;
	private ArrayList<IBalanceChange> list = new ArrayList<IBalanceChange>();
	IBalanceChange change;

	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}


	public void deposite(int amount) {
		this.balance = this.balance + amount;
		notification();
	}

	public void withdrawl(int amount) {
		if (this.balance - amount > 500) {
			this.balance = this.balance - amount;
			notification();
		}
	}

	public void registerdListner(IBalanceChange ibalance) {
		list.add(ibalance);
	}

	public void notification() {
		for (IBalanceChange i : list) {
			i.update(this);
			
		}
	}

}
