package com.techlab.array.list;

import java.awt.List;
import java.util.ArrayList;

import com.techlab.student.Student;

public class ArraylistStudentTest {
	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<Student>();
		Student student = new Student(101, "nikita");
		Student student1 = new Student(102, "trupti");
		Student student2 = new Student(103, "pallavi");

		stud.add(student);
		stud.add(student1);
		stud.add(student2);

		System.out.print("Display=");
		for (Student s : stud) {
			System.out.print("{" + "RollNO=" + s.getRollno() + " Name:"
					+ s.getName() + "}");
		}
		Student student4 = new Student(104, "aditya");
		stud.add(3, student4);
		System.out.println();
		System.out.print("Adding=");
		for (Student s : stud) {
			System.out.print("{" + "RollNO=" + s.getRollno() + " Name:"
					+ s.getName() + "}");
		}
		student4.setName("ankur");
		student4.setRollno(104);
		stud.set(3, student4);
		System.out.println();
		System.out.print("updating=");
		for (Student s : stud) {
			System.out.print("{" + "RollNO=" + s.getRollno() + " Name:"
					+ s.getName() + "}");
		}
		stud.remove(3);
		System.out.println();
		System.out.print("Deleting=");
		for (Student s : stud) {
			System.out.print("{" + "RollNO=" + s.getRollno() + " Name:"
					+ s.getName() + "}");
		}

	}
	
	public void printDetails(List list){
		
	}

}
