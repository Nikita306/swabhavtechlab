package com.techlab.student;

import java.util.Comparator;

import com.techlab.student.Student;

public class SortByRollNo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.getRollno() == s2.getRollno()) {
			return 0;
		} else if (s1.getRollno() > s2.getRollno()) {
			return 1;
		} else {
			return -1;
		}
	}

}
