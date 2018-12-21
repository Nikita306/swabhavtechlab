package com.techlab.contact;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContactRead {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader(
				"C:\\Users\\admin\\Desktop\\contact.txt");
		BufferedReader br = new BufferedReader(reader);
		String line = " ";
		String splitby = ",";
		int income = 0;
		int count = 0;
		int max=0;
		Contact contact=new Contact();

		while ((line = br.readLine()) != null) {
			String[] array = line.split(splitby);
			System.out.println(array[0] + " " + array[1]);
			if (count > 0) {
				income = income + Integer.parseInt(array[3]);
				if(max< Integer.parseInt(array[3])){
					max=Integer.parseInt(array[3]);
					contact.setFirstName(array[0]);
					contact.setLastName(array[1]);
					contact.setMobileNo(array[2]);
				}
			}
			count++;
		}
		count=count++ -1;
		System.out.println("Found " + count + " counts");
		System.out.println("TotalIncome=" + income);
		System.out.println("maximum income "+max);
		System.out.println("details= "+contact.getFirstName()+" "+contact.getLastName()+" "+contact.getMobileno());
		

	}
}
