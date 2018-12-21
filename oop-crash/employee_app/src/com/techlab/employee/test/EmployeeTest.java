package com.techlab.employee.test;

import com.techlab.employee.Employee;

public class EmployeeTest {
	public static void main(String args[]) {

		Employee employee1 = new Employee();
		employee1.setId(101);
		employee1.setFirstName("nikita");
		employee1.setLastName("jadhav");
		employee1.setSalary(50000);
		employee1.setCommission(0.5);
		// printDetails(employee1);

		Employee employee2 = new Employee();
		employee2.setId(102);
		employee2.setFirstName("trupti");
		employee2.setLastName("mahale");
		employee2.setSalary(40000);
		employee2.setCommission(1.2);
		// printDetails(employee2);

		Employee employee3 = new Employee();
		employee3.setId(103);
		employee3.setFirstName("Aditya");
		employee3.setLastName("jadhav");
		employee3.setSalary(60000);
		employee3.setCommission(0.2);
		//printDetails(employee3);

		Employee employee[] = new Employee[3];
		employee[0] = employee1;
		employee[1] = employee2;
		employee[2] = employee3;
		for (int i = 0; i < employee.length; i++) {
			printDetails(employee[i]);
		}
	}

	public static void printDetails(Employee e) {
		System.out.println(e.getId() + " " + e.getFirstName() + " "
				+ e.getLastName() + " " + e.getSalary() + " "
				+ e.getcommission());
		System.out.println(e.hashCode());
	}

}
