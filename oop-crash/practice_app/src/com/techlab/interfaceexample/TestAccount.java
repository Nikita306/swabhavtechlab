package com.techlab.interfaceexample;

public class TestAccount {

	public static void main(String[] args) {

		Account acc=new SavingAccount();
		acc.deposite(100);
		
		Account account=new CurrentAccount();
		account.deposite(10);
	}

}
