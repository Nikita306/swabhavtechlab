package com.techlab.employee.test;

import com.techlab.employee.Employee;

public class TestEmployeeTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(102,"nikita","jadhav", 50000, 0.2,
				EmployeeTime.halftime);
		printDetails(employee); 


	}

	public static void printDetails(Employee e) {

		System.out.println("id=" + e.getId() + "\t" + "FirstName="
				+ e.getFirstName() +"\t"+"LastName="+e.getLastName()+"\t" + "Salary=" + e.getSalary()+ "\t" + "Commission="
				+ e.getcommission() + "\t" + "time="+e.time());
	}

}
