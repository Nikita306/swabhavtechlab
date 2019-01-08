package com.techlab.test;

import com.techlab.institute.BranchOption;
import com.techlab.institute.Person;
//import com.techlab.institute.Student;

public class TestStudent {

	public static void main(String[] args) {
		Person student = new Person(101, "Thane", "30-06-1996");
		System.out.println("Student Details:");
		System.out.println("ID=" + student.getid() + " \n" + "Address="
				+ student.getAddress() + "\n" + "DOB=" + student.getDob()+"\n"+"Branch="+BranchOption.COMPUTER);

	}
}
