package com.techlab.testemployee;

import com.techlab.employee.Manager;

public class TestManager {
	public static void main(String[] args) {
		Manager manager=new Manager("nikita",101,1000);
		System.out.println(manager.getName()+" "+manager.getId()+" "+manager.getBasicSalary());
		System.out.println("Annul Salary is "+manager.annulIncome());
	}

}
