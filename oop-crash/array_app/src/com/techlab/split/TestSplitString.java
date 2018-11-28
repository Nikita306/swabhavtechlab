package com.techlab.split;

import java.util.Arrays;

public class TestSplitString {
	public static void main(String[] args) {
		
		String[] print = splitString("my name is nikita");
		for (String split : print) {
			System.out.println(split);
		}

		String[] print1 = splitString("my name is nikita");
		System.out.println(Arrays.toString(print1));

		String[] urlString = splitUrl("www.google.com");
		System.out.println(Arrays.toString(urlString));

	}

	public static String[] splitString(String sentence) {

		String splitString[] = sentence.split(" ", 6);

		return splitString;
	}

	public static String[] splitUrl(String url) {
		String[] splitString = url.split("\\.");

		return splitString;

	}
}