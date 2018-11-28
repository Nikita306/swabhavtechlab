package com.techlab.customer.test;

import com.techlab.customer.Customer;

public class CustomerTest {
	public static void main(String args[]) {
		Customer c1 = new Customer();

		System.out.println("first name " + c1.firstName);
		System.out.println("last name " + c1.lastName);
		// System.out.println("age" +customer.age);
		System.out.println("Id=" + c1.id);

		c1.firstName = "nikita";
		c1.lastName = "jadhav";
		c1.id = -101;

		System.out.println("first name " + c1.firstName);
		System.out.println("last name " + c1.lastName);
		System.out.println("id " + c1.id);

		
	}
}
