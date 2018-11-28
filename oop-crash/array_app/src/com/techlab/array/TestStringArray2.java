package com.techlab.array;

public class TestStringArray2 {
	public static void main(String[] args) {
		String[] name = { "nikita", "trupti", "supriya", "suraj", "aditya"};
		TestStringArray3 array=new TestStringArray3 ();
		String newarray[]=array.getNameContainS(name);
		
		for (String name1 : newarray) {
			System.out.println(name1);

		}

	}

}
