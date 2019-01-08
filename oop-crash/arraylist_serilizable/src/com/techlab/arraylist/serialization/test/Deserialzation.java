package com.techlab.arraylist.serialization.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import com.techlab.serialization.Student;

public class Deserialzation {

	public static void main(String[] args) throws Exception {

		FileInputStream fileStream = new FileInputStream(
				"D:\\SwabhavRepository\\oop-crash\\arraylist_serilizable\\studentdata.ser");
		ObjectInputStream os = new ObjectInputStream(fileStream);

		Student account = (Student) os.readObject();
		System.out.println(account.getName() + " " + account.getRollno());
		os.close();

	}

}
