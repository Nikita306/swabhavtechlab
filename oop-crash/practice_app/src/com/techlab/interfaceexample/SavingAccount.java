package com.techlab.interfaceexample;

public class SavingAccount implements Account {

	@Override
	public void deposite(double amount) {
		amount = balance + amount;
		System.out.println(amount);

	}

}
