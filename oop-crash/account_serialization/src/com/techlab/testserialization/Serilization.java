package com.techlab.testserialization;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.techlab.serialization.Account;

public class Serilization {
	public static void main(String[] args) throws Exception {
		Account account = new Account("saving account", 2000, 101);

		FileOutputStream fileStream = new FileOutputStream(
				"D:\\SwabhavRepository\\oop-crash\\account_serialization\\account.ser");
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		os.writeObject(account);
		os.close();
		System.out.println("account");

	}

}
