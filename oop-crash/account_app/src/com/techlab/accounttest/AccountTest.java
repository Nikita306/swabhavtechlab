package com.techlab.accounttest;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1=new Account("nikita",5000,true);
		System.out.println(account1);
		account1.balanceDeposit(1000);
		account1.balanceDeposit(1000);
		account1.balanceWithdraw(1000);
		
		Account account2=new Account("trupti",6000);
		account2.balanceDeposit(1000);
		account2.balanceWithdraw(1000);
		System.out.println(account2);
		
		Account account3=new Account("nik",1000);
		account3.balanceDeposit(100);
		account3.balanceWithdraw(100);
		System.out.println(account3);
		
		System.out.println("Number of Transaction is "+Account.getTransactionCount());
		

	}

}
