package com.techlab.args;

import java.awt.List;
import java.util.Map;

public class TestUrlArgs {
	public static void main(String[] args) {
		int occurence = foundOccurence(
				"http://www.swabhavtechlab.com?developer=nikita", '.');
		System.out.println("occurence is " + occurence);

		int index[] = foundIndex("http://www.swabhavtechlab.com?developer=nikita", '.');
		for (int dotIndex : index) {
			System.out.println(dotIndex);
		}

		String company = companyName("http://www.swabhavtechlab.com?developer=nikita",'.');
		System.out.println("company name :" + company);

		String developer = developerName("http://www.swabhavtechlab.com?developer=Nikita Jadhav", '?');
		System.out.println(developer);

		 String name[] = companyNameDeveloperName("http://www.swabhavtechlab.com?developer=Nikita Jadhav",'?','.');
		 System.out.println("details of the company :");
		 for (String companyDeveloper : name) {
		 System.out.println(companyDeveloper);
		 }

	}

	public static int foundOccurence(String name, char charToFind) {

		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == charToFind) {
				count = count + 1;
			}
		}
		return count;
	}

	public static int[] foundIndex(String name, char charToFind) {
		int k = 0;
		int dotIndex[] = new int[foundOccurence(name, charToFind)];
		// num = name.indexOf(charOfIndex);
		for (int i = 0; i < name.length(); i++) {
			if (charToFind == name.charAt(i)) {
				dotIndex[k] = i;
				k++;

			}
		}
		return dotIndex;

	}

	public static String companyName(String name, char charToFind) {
		int index[] = foundIndex(name, charToFind);
		String substring = name.substring(index[0] + 1, index[1]);
		return substring;

	}

	public static String developerName(String name, char charToFind) {
		String substring = null;
		int ind = name.indexOf(charToFind);
		substring = name.substring(ind + 1);
		return substring;

	}

	
	  public static String[] companyNameDeveloperName(String name, char charToFind, char charFind ){
		  
	   String substring1=companyName(name,charFind); 
	   String substring2=developerName(name,charToFind); 
	   String  substring[]={substring1,substring2};
	  return substring ;
	  
	  }
	 

}
