package com.techlab.anagram;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String string1 = "RAIL! SAFETY";
		String string2 = "fairy tales";
		boolean result = checkAnagram(string1, string2);
		System.out.println(result);
	}

	public static boolean checkAnagram(String string1, String string2) {
		int element[] = new int[256];
		// int index1 = 0;
		// int index2 = 0;
		if (string1.length() != string2.length()) {
			return false;
		}
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		

		// string1=string1.replaceAll("[^A-Za-z]+", "");
		// string2=string2.replaceAll("[^a-zA-Z]+", "");
		char c = 0;
		for (int i = 0; i < string1.length() || i < string2.length(); i++) {
			c = string1.charAt(i);
			c = string2.charAt(i);
			if (c < 65 || (c > 90 && c < 97) || (c > 122)) {
				string1 = string1.replace(string2.substring(i, i + 1), "");
				string2 = string2.replace(string2.substring(i, i + 1), "");
			}

		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);

		
		return Arrays.equals(array1, array2);

	}
}
