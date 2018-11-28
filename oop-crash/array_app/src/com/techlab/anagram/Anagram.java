package com.techlab.anagram;

public class Anagram {
	public static void main(String[] args) {
		String[] result = { "rail safety", "fairy tale" };
		findAnagram(result);

	}

	public static boolean checkAnagram(String string1, String string2) {
		int element[] = new int[256];
		int index1 = 0;
		int index2 = 0;
		boolean status = true;
		if (string1.length() != string2.length()) {
			status = false;
		}
		for (int i = 0; i < string1.length() && i < string2.length(); i++) {
			index1 = (int) string1.charAt(i);
			index2 = (int) string2.charAt(i);
			element[index1]++;
			element[index2]++;
		}
		for (int i = 0; i < 256; i++) {
			if (element[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void findAnagram(String string) {
		String array1[]=new String[256];
		String array2[]=new String[256];
		
		
		
		
	}
}
