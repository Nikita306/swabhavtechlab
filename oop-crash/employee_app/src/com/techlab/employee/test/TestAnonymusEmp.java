package com.techlab.employee.test;

import com.techlab.employee.Employee;

public class TestAnonymusEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Employee().getSalary());

		PrintDetails(new Employee());

	}

	public static void PrintDetails(Employee e) {
		System.out.println("first name=" + e.getFirstName() + "last name="
				+ e.getLastName() + "salary=" + e.getSalary() + "commission="
				+ e.getcommission());

	}
}