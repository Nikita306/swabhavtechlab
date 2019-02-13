package com.techlab.test.account;

import com.techlab.account.Account;
import com.techlab.account.EmailListner;
import com.techlab.account.MsgListner;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(101, "niki", 1000);
		EmailListner email = new EmailListner();
		MsgListner msg = new MsgListner();

		account.registerdListner(email);
		// account.registerdListner(msg);
		account.deposite(200);
		account.withdrawl(200);
		account.withdrawl(1000);

	}
}
