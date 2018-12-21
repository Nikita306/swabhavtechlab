package com.techlab.test;

import com.techlab.account.Account;
import com.techlab.account.CurrentAccount;
import com.techlab.account.SavingAccount;

public class TestPolymorphism {

	public static void printSlip1(Account acc) {
		System.out.println("Name=" + acc.getName() + "\t" + "Balance="
				+ acc.getBalance() + "\t" + "AcccountNo=" + acc.getAccountNo());
	}

	public static void printSlip2(Account[] acc) {
		
		for (Account a : acc) {
			printSlip1(a);
			//System.out.println(a.getName() + " " + a.getBalance() + " "
					//+ a.getAccountNo());
		}
	}

	public static void main(String[] args) {
		Account saving = new SavingAccount("abc", 1000, 101);
		saving.deposite(1000);
		saving.withdrwal(500);

		printSlip1(saving);
		Account current = new CurrentAccount("nik", 1000, 102);
		printSlip1(current);

		Account[] array = new Account[2];
		array[0] = new SavingAccount("niki", 1000, 101);
		array[1] = new CurrentAccount("nik", 2000, 102);
		printSlip2(array);

	}

}
