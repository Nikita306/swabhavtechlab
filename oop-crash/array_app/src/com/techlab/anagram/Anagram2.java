package com.techlab.anagram;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {
		String string1 = "RAIL!safety!";
		String string2 = "fairy tales";
		boolean result = printAnagram(string1, string2);
		System.out.println(result);
	}

	public static int[] cheackAnagram(String string1) {
		String string1Lower = string1.toLowerCase();
		// String string2Lower = string2.toLowerCase();
		int storingArray[] = new int[255];

		char c = 0;
		for (int i = 0; i < string1Lower.length(); i++) {
			c = string1Lower.charAt(i);
			if (c < 65 || (c > 90 && c < 97) || (c > 122)) {
				string1Lower = string1Lower.replace(string1Lower.substring(i, i + 1), "");
			}
		}

		for (int i = 0; i < string1Lower.length(); i++) {
			int index1 = (int) string1Lower.charAt(i);
			// int index2 = (int) string2Lower.charAt(i);
			storingArray[index1]++;
			// storingArray[index2]++;
		}

		return storingArray;
	}

	public static int[] cheackAnagram2(String string2) {
		int storingArray2[] = new int[255];
		String string2Lower = string2.toLowerCase();
		storingArray2 = cheackAnagram(string2Lower);
		return storingArray2;

	}

	public static boolean printAnagram(String string1, String string2) {
		int array1[] = new int[255];
		int array2[] = new int[255];
		array1 = cheackAnagram(string1);
		array2 = cheackAnagram(string2);

		return Arrays.equals(array1, array2);

	}

}
