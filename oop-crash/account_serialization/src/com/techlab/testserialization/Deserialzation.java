package com.techlab.testserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.techlab.serialization.Account;

public class Deserialzation {

	public static void main(String[] args) throws Exception {

		FileInputStream fileStream = new FileInputStream(
				"D:\\SwabhavRepository\\oop-crash\\account_serialization\\account.ser");
		ObjectInputStream os = new ObjectInputStream(fileStream);

		Account account = (Account) os.readObject();
		System.out.println(account.getName() + " " + account.getBalance() + " "
				+ account.getAccountNo());
		os.close();

	}

}
