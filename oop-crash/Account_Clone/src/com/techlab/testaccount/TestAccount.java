package com.techlab.testaccount;

import com.techlab.account.Account;

public class TestAccount {
	public static void main(String[] args){
		Account acc1=new Account(101,"nikita");
		System.out.println(acc1.getAccountNo()+" "+acc1.getName());
		System.out.println(acc1.hashCode());
		
			try {
				Account acc2 = (Account) acc1.clone();
				System.out.println(acc2.getAccountNo()+" "+acc2.getName());
				System.out.println(acc2.hashCode());
			} catch (CloneNotSupportedException e) {
			}
		
	}

}
