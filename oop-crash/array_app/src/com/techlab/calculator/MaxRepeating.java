package com.techlab.calculator;

public class MaxRepeating {
	public static void main(String[] args) {
		char print = maximumRepeating("helloworld");
		System.out.println(print);

	}

	public static char maximumRepeating(String inputString) {
		int[] element = new int[256];
		int max = element[0];
		char result = 0;
		int indexOfArray = 0;
		for (int i = 0; i < inputString.length(); i++) {
			int indexvalue = (int) inputString.charAt(i);
			element[indexvalue]++;
		}
		for (int i = 0; i < element.length; i++) {
			if (element[i] > max) {
				max = element[i];
				indexOfArray = 1;
				result = (char)i;
			}
		}
		return result;
	}
}
// int indexvalue = 0;
// element[inputString.charAt(i)]++;
// if (indexvalue < element[inputString.charAt(i)]) {
// indexvalue = element[inputString.charAt(i)];
// result=inputString.charAt(i);
// }
