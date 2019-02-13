package com.techlab.account;

public class EmailListner implements IBalanceChange{

	@Override
	public void update(Account account) {
		System.out.println("Email Listner has been update balance now balance is "+account.getBalance());
		
	}

}
