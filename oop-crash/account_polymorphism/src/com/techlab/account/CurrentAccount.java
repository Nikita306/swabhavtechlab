package com.techlab.account;

public class CurrentAccount extends Account {
	private static final double OVERDRAFT_BALANC = -2000;

	public CurrentAccount(String name, double balance, int accountNo) {
		super(name, balance, accountNo);
	}

	@Override
	public void withdrwal(int amount) {
		if (this.getBalance() - amount >= OVERDRAFT_BALANC) {
			this.balance = this.balance - amount;
		}

	}
}