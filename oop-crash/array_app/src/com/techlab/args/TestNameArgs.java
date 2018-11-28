package com.techlab.args;

public class TestNameArgs {
	public static void main(String[] args) {
		int print = foundOccurence("nikita", 'i');
		System.out.println("occurance found " + print);
		
		
		int index[] = foundIndex("nikita", 'i');
		for(int charIndex:index){
		 
		System.out.println(charIndex);
		
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
		int num = 0;
		int k=0;
        int charIndex[]=new int[foundOccurence( name, charToFind)];
		num = name.indexOf(charToFind);
		for (int i = 0; i < name.length(); i++) {
			if (charToFind == name.charAt(i)) {
			 charIndex[k]=i;
			 k++;

			}
		}
		return charIndex;
	}
}