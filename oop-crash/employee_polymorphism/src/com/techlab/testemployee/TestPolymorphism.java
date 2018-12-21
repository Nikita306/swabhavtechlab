package com.techlab.testemployee;

import com.techlab.employee.Analyst;
import com.techlab.employee.Employee;
import com.techlab.employee.Manager;
import com.techlab.employee.Programmer;

public class TestPolymorphism {

	public static void main(String[] args) {
		Employee emp1 = new Manager("ravi", 101, 100);
		printSalarySlipt(emp1);

		Employee emp2 = new Programmer("ankur", 101, 100);
		printSalarySlipt(emp2);

		Employee emp3 = new Analyst("aditya", 101, 100);
		printSalarySlipt(emp3);
	}

	public static void printSalarySlipt(Employee emp) {
		System.out.println("name=" + emp.getName() + "\t" + "id= "
				+ emp.getId() + "\t" + "Basic salary " + emp.getBasicSalary()
				+ " \t" + "Annul Income " + emp.annulIncome() + "\n "
				+ "Role is " + emp.role());
	}
}
