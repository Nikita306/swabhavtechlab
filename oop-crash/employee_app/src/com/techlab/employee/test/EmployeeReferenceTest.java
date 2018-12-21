package com.techlab.employee.test;

import com.techlab.employee.Employee;

public class EmployeeReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setFirstName("trupti");
		PrintDetails(e1);
		
		Employee e2=new Employee();
		e2.setFirstName("nikita");
		PrintDetails(e2);
		
		Employee e3=e2;
		e3.setFirstName("techlab");
		PrintDetails(e3);
		PrintDetails(e2);
		e3=null;
		//PrintDetails(e3);
		PrintDetails(e2);

	}
	public static void PrintDetails(Employee e){
		System.out.println(e.getFirstName());
	}

}
