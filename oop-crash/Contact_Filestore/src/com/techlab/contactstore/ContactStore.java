package com.techlab.contactstore;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.FileHandler;

public class ContactStore implements Serializable {
	public ArrayList<Contact> contactList;
	private String filename = "contact\\contactfile.ser";
	
	
	public ContactStore() throws Exception {
		contactList =retrive();
		
	}

	public void addToList(Contact addContact) throws Exception {
		contactList.add(addContact);
		writeToFile();

	}

	public ArrayList<Contact> retrive() throws Exception {
		ArrayList<Contact> file = readFromFile(this.filename);
		return file;

	}

	public Contact search(String fname) {
		;
		Contact contactfound = null;
		for (Contact c : contactList) {
			if (c.getFname().equalsIgnoreCase(fname)) {
				contactfound = c;
			}
		}
		return contactfound;

	}

	public boolean DeleteFromList(String fname) throws Exception {
		Contact deleteContact = search(fname);

		if (deleteContact == null) {
			return false;
		} else {
			 contactList.remove(deleteContact);
			 writeToFile();
		}
		return true;
	}

	private void writeToFile() throws Exception { // save
		FileOutputStream fos = new FileOutputStream(this.filename);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(contactList);
		os.close();
		System.out.println("file save sucessfully");
	}

	private ArrayList<Contact> readFromFile(String file) throws Exception { // Retrieve
		ArrayList<Contact> retrivecontact = null;
		File f1 = new File(file);
		if (f1.exists()) {
			FileInputStream fos = new FileInputStream(file);
			ObjectInputStream os = new ObjectInputStream(fos);
			retrivecontact = (ArrayList<Contact>) os.readObject();
			os.close();
		} else {
			System.out.println("file not exit");
		}

		return retrivecontact;
	}

}
