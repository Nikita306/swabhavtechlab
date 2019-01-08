package com.techlab.testaccount;

import com.techlab.accountexception.Account;
import com.techlab.accountexception.InSuffectiontFundException;

public class TestAccount {
	public static void main(String[] args) {
		Account account=new Account("nikita",101,1000);
		account.depositeAmmount(500);
		//System.out.println(account);
		try{
			account.withdrawlAmmount(1000);
		}
		catch (InSuffectiontFundException ex){
			System.out.println(ex.getMessage());
			
		}
		//System.out.println(account);
	}

}
