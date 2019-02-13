package com.techlab.contactstore;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ContactStore {
	
	public ArrayList<Contact> contactList;
	
	public ContactStore(){
	contactList =new ArrayList<Contact>();
		
	}
	public void addToList(Contact addContact){
		contactList.add(addContact);
		//System.out.println(addContact.getFname()+" "+addContact.getLname()+" "+addContact.getPhoneNo());
	}
	
	public ArrayList<Contact> getContact(){
		return contactList;
		
	}
	
	public Contact search(String fname){  ;
	Contact contactfound=null;
		for(Contact c:contactList){
			if(c.getFname().equalsIgnoreCase(fname)){
			   contactfound=c;
			}
		}
		return contactfound;
		
	}
	public boolean DeleteFromList(String fname){
		Contact deleteContact=search(fname);
		
			if(deleteContact==null){
				return false;
			}else{
				return contactList.remove(deleteContact);
		
		}
			//return true;
		
	}
	}
	

//}
