package com.techlab.testemployee;

import com.techlab.employee.Analyst;

public class TestAnalyst {

	public static void main(String[] args) {
		Analyst a=new Analyst("trupti",101,100);
		System.out.println(a.getName()+" "+a.getId()+" "+a.getBasicSalary());
		System.out.println("Annul Income "+a.annulIncome());

	}

}
