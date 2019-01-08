package com.techlab.test.contactstore;

import java.sql.Array;
import java.util.ArrayList;

import com.techlab.contactstore.Contact;
import com.techlab.contactstore.ContactStore;

public class TestSerialization {

	public static void main(String[] args) throws Exception {
		/*ContactStore store = new ContactStore();
		Contact contact1 = new Contact("nik", "jadhav", "123");
		Contact contact2 = new Contact("nikita", "jadhav", "123");
		store.addToList(contact1);
		store.addToList(contact2);*/

		ContactStore re = new ContactStore();
		re.retrive();

		for (Contact contact : re.retrive()) {
			System.out.println(contact.getFname() + " " + contact.getLname()
					+ " " + contact.getPhoneNo());
		}
	}
}
