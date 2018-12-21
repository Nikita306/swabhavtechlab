package com.techlab.testemployee;

import com.techlab.employee.Programmer;

public class TestProgrammer {

	public static void main(String[] args) {
		Programmer pr=new Programmer("aditya",101,10000);
		System.out.println(pr.getName()+" "+pr.getId()+" "+pr.getBasicSalary());
		System.out.println("Annul Income is "+pr.annulIncome());

	}

}
