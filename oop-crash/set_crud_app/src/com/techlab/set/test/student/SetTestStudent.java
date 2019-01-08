package com.techlab.set.test.student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.techlab.set.integer.Student;


public class SetTestStudent {

	public static void main(String[] args) {
		HashSet<Student> student=new HashSet<Student>();
		Student student1=new Student(101,"nikita");
		//System.out.println(student1.hashCode());
		Student student2=new Student(102,"trupti");
		Student student3=new Student(101,"nikit");
		//System.out.println(student3.hashCode());
		
		System.out.println("Disply Record");
		student.add(student1);
		student.add(student2);
		student.add(student3);
		displayContact(student);
		
		System.out.println("add record");
		student.add(new Student(103,"adi"));
		displayContact(student);
		
		System.out.println("delete record");
		student.remove(student2);
		displayContact(student);
		
		}
	
	
	public static void displayContact(HashSet<Student> set){
		for(Student s:set){
			System.out.println("rollno="+s.getRollno()+" "+"name="+s.getName());
		
		}
	}
		
}
