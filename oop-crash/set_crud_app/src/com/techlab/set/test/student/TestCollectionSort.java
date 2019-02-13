package com.techlab.set.test.student;

import java.util.Set;
import java.util.TreeSet;

import com.techlab.set.integer.Student;

public class TestCollectionSort {

	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();

		Student student1 = new Student(103,"nikita");
		Student student2 = new Student(101,"nik");
		Student student3 = new Student(102,"trupti");

		set.add(student1);
		set.add(student2);
		set.add(student3);
		System.out.println(set.size());
		System.out.println(set);
		
		for(Student a:set){
			System.out.println(a.getRollno()+" "+a.getName());
		}
	}
}
