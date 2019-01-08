package com.techlab.arraylist.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.techlab.student.Student;

public class Deserialization {
	public static void main(String[] args) throws Exception {
		ArrayList<Student> stud = new ArrayList<Student>();
		
		FileInputStream fis=new FileInputStream("D:\\SwabhavRepository\\oop-crash\\arraylist_serializable_app\\data.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		stud=(ArrayList) ois.readObject();
		fis.close();
		for(Student s:stud){
			System.out.println("RollNo="+s.getRollno()+"  Name="+s.getName());
		}
	}

}
