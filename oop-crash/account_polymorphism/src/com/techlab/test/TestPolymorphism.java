package com.techlab.test;

import com.techlab.account.Account;
import com.techlab.account.CurrentAccount;
import com.techlab.account.SavingAccount;

public  class TestPolymorphism  {
	
	
	public  static void printSlip(Account acc){
		System.out.println("Name="+acc.getName()+"\t"+"Balance="+acc.getBalance()+"\t"+"AcccountNo="+acc.getAccountNo());
		//acc.deposite(1000);
		//acc.withdrwal(4000);
		
				
		
	}

	public static void main(String[] args) {
		Account saving=new SavingAccount("abc",1000,101);
		saving.deposite(1000);
		saving.withdrwal(500);
		printSlip(saving);
		Account current=new CurrentAccount("nik", 1000,102);
		printSlip(current);
		

	}

	

}
