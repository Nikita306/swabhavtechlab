package com.techlab.test;

import com.techlab.account.Account;
import com.techlab.account.CurrentAccount;

public class TestCurrent {

	public static void main(String[] args) {
		CurrentAccount account=new CurrentAccount("trupti",1000,102);
		account.withdrwal(3000);
		System.out.println(account);
		

	}

}
