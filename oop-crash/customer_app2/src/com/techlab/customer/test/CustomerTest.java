package com.techlab.customer.test;

import com.techlab.customer.Customer;

public class CustomerTest {
	public static void main(String args[]) {
		Customer c1 = new Customer();

		System.out.println("first name " + c1.firstName);
		System.out.println("last name " + c1.lastName);
		// System.out.println("age" +customer.age);
		//System.out.println("Id=" + c1.id);

		c1.firstName = "nikita";
		c1.lastName = "jadhav";
	//	c1.id = -101;

		System.out.println("first name= " + c1.firstName);
		System.out.println("last name= " + c1.lastName);
		//System.out.println("id= " + c1.id);

		Customer c2 = new Customer();

		c2.firstName = "trupti";
		c2.lastName = "mahale";
		//c2.canYouChangeId(-100); 
		// c2.age = 30;

		System.out.println("first name= " + c2.firstName);
		System.out.println("last name= " + c2.lastName);
		//System.out.println("id= " + c2.id);
		// System.out.println("age " + c2.age);

		c2.canYouChangeAge(25);
		c2.canYouChangeAge(20);

		System.out.println(c2.canYouReturnAge());
		
		c2.canYouChangeId(0);
		c2.canYouChangeId(100);
		c2.canYouChangeId(-101);
		c2.canYouChangeId(101);
	
		
		System.out.println(c2.canYoureturnId());
	}
}
