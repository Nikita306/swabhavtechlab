package com.techlab.test.contactstore;

import com.techlab.contactstore.Contact;
import com.techlab.contactstore.ContactStore;


public class TestContactStrore {

	public static void main(String[] args) {
		addToContact();
		displayAll();
		delete();
		update();

	}

	private static void addToContact() {
		Contact c=new Contact();
		Contact contact1=new Contact("nikita","jadhav","987456321");
		Contact contact2=new Contact("trupti","mahale","741258963");
		ContactStore contact=new ContactStore();
		contact.addToList(contact1);
		contact.addToList(contact2);
		System.out.println(contact.getContact().size());
		//System.out.println(c.getFname());
		}
	

	private static void displayAll() {
		//ContactStore contact=new ContactStore();
		//System.out.println(contact.getContact().size());
	
	}
	
	private static void delete(){
		ContactStore contact=new ContactStore();
		Contact contact2=new Contact("trupti","mahale","741258963");
		Contact contact3=new Contact("nikita","jadhav","741258963");
		contact.addToList(contact2);
		contact.addToList(contact3);
		System.out.println(contact.getContact().size());
		if(contact.DeleteFromList("trupti")==true)
		{
			System.out.println("record delete");
		}else{
			System.out.println("record not found");
		}
			System.out.println(contact.getContact().size());
			
		}
	
	private static void update(){
		ContactStore contact=new ContactStore();
		Contact contact2=new Contact("trupti","mahale","741258963");
		Contact contact3=new Contact("nikita","jadhav","741258963");
		contact.addToList(contact2);
		contact.addToList(contact3);
		System.out.println("after update");
		contact2.setFname("manju");
		System.out.println(contact2.getFname()+" "+contact2.getLname()+" "+contact2.getPhoneNo());
		
	}
		
	}
	


