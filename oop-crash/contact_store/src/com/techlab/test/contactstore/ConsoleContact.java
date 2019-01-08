package com.techlab.test.contactstore;

import java.util.Scanner;

import com.techlab.contactstore.Contact;
import com.techlab.contactstore.ContactStore;

public class ConsoleContact {
	static final int ADD=1;
	static final int DELETE=2;
	static final int UPDATE=3;
	static final int DISPLAY=4;
	public static void main(String[] args) {
		String fname = null;
		String lname = null;
		String phoneNo = null;

		ContactStore contactstore = new ContactStore();
		Scanner sc = new Scanner(System.in);
		int choice;
		//char exit = 'Y';
		//while (exit == 'Y') {
			do {
				System.out.println("Menu:\n 1)Add contact: \n 2)Delete: \n 3)Update : \n 4)Display : \n 5)Exit ");
				System.out.println("Please Enter your Choice:");
				choice = sc.nextInt();
				switch (choice) {
				case ADD:
					char add = 'Y';
					while (add == 'Y') {
						System.out.println("Enter first name:");
						fname = sc.next();
						System.out.println("Enter Last name:");
						lname = sc.next();
						System.out.println("Enter phoneNumber");
						phoneNo = sc.next();
						Contact contact = new Contact(fname, lname, phoneNo);
						contactstore.addToList(contact);
						System.out.println("Do you want to add..?? y/n");
						String word = sc.next();
						word = word.toUpperCase();
						add = word.charAt(0);
					}
					for (Contact c : contactstore.getContact()) {
						System.out.println(c.getFname() + " " + c.getLname()
								+ " " + c.getPhoneNo());
					}
					// System.out.println(contactstore.getContact().size());
					System.out.println("Add successfully!!!!");
					break;

				case DELETE:System.out.println("Enter the firstname  which contact you want to delete");
					String name=sc.next();
					System.out.println("before delete Size="+ contactstore.getContact().size());

					if (contactstore.DeleteFromList(name)==true) {
						System.out.println("Record delete!!!!!");
					} else {
						System.out.println("record not found");
					}
					
					System.out.println("after delete record size "
							+ contactstore.getContact().size());

					break;

				case UPDATE:
					System.out.println("Enter first name:");
					fname = sc.next();
					System.out.println("Enter Last name:");
					lname = sc.next();
					System.out.println("Enter phoneNumber");
					phoneNo = sc.next();
					Contact con = new Contact(fname, lname, phoneNo);
					contactstore.addToList(con);
					con.setFname("o");
					
					System.out.println(con.getFname() + " " + con.getLname()
							+ " " + con.getPhoneNo());
					System.out.println("update successfully");
					break;

				case DISPLAY:
					System.out.println("Display contact");
					for (Contact c : contactstore.getContact()) {
						System.out.println("First name="+c.getFname() +"\t"+"Last Name=" + c.getLname()+"\t"
								+ "Phone number " + c.getPhoneNo());
					}
					System.out.println("Display "
							+ contactstore.getContact().size() + " Contact");

					break;
					default:
					System.out.println("Thank you for using this application!!!!!!");
					
				}

			} while (choice != 5);
			
		
	}
}
