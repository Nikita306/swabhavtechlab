package com.techlab.array.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import com.techlab.student.SortByAge;
import com.techlab.student.SortByName;
import com.techlab.student.SortByRollNo;
import com.techlab.student.Student;

public class TestCollectionSort {

	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<Student>();
		Student student = new Student(103, "nikita",23);
		Student student1 = new Student(102, "trupti",22);
		Student student2 = new Student(101, "pallavi",25);

		stud.add(student);
		stud.add(student1);
		stud.add(student2);
		//Collections.sort(stud, new SortByAge());
		//Collections.sort(stud, new SortByName());
		Collections.sort(stud, new SortByRollNo());
		displayContact(stud);


	}
	public static void displayContact(ArrayList<Student> stud){
		for(Student s:stud){
			System.out.println("rollno="+s.getRollno()+" "+"name="+s.getName()+" "+"Age="+s.getAge());
		
		}

	}}
