package com.techlab.arraylist.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.techlab.student.Student;

public class Serialization {
	public static void main(String[] args) throws Exception {
		ArrayList<Student> stud = new ArrayList<Student>();

		stud.add(new Student(101, "nikita"));
		stud.add(new Student(102, "trupti"));
		stud.add(new Student(103, "radha"));
		stud.add(new Student(104, "supriya"));
		stud.add(new Student(105, "pinky"));

		FileOutputStream fos = new FileOutputStream(
				"D:\\SwabhavRepository\\oop-crash\\arraylist_serializable_app\\data.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stud);
		oos.close();
		fos.close();
		System.out.println("serialization");

	}

}
