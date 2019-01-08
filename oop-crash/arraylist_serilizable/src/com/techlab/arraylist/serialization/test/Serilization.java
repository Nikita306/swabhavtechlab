package com.techlab.arraylist.serialization.test;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import com.techlab.serialization.Student;

public class Serilization {
	public static void main(String[] args) throws Exception {
		Student account = new Student(101,"nik");

		FileOutputStream fileStream = new FileOutputStream(
				"D:\\SwabhavRepository\\oop-crash\\arraylist_serilizable\\studentdata.ser");
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		os.writeObject(account);
		os.close();
		System.out.println("account");

	}

}
