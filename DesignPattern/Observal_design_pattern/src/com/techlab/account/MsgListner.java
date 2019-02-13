package com.techlab.account;

public class MsgListner implements IBalanceChange{

	@Override
	public void update(Account account) {
		System.out.println("Message Listner has been update balance now balance is "+account.getBalance());
		
	}

}
