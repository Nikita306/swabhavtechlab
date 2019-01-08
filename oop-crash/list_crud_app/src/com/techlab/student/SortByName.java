package com.techlab.student;

import java.util.Comparator;

import com.techlab.student.Student;

public class SortByName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			return s1.getName().compareTo(s2.getName());
	}
}
