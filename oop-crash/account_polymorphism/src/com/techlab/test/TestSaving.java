package com.techlab.test;

import com.techlab.account.Account;
import com.techlab.account.SavingAccount;

public class TestSaving {

	public static void main(String[] args) {
		SavingAccount account=new SavingAccount("nikita",1000d,101);
		System.out.println(account);
		account.deposite(1000);
		System.out.println(account);
		account.withdrwal(200);
		System.out.println(account);

	}

}
