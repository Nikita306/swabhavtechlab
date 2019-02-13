package com.techlab.practice;

import java.util.HashMap;
import java.util.Map;

public class OccurenceNumber {
	/*
	 * public static void occerence(int[] array) { for (int i = 0; i <
	 * array.length; i++) { int count = 0; for (int j = 0; j < array.length;
	 * j++) { if (array[i] == array[j]) { count++; }
	 * 
	 * } System.out.println(array[i] + " " + count); }
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { int[] array = { 1, 2, 2, 5, 2,
	 * 3, 4, 4 }; occerence(array);
	 * 
	 * }
	 */

	public static HashMap<Integer, Integer> Occurence(int[] inputArray) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < inputArray.length; i++) {
			int count = 0;
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					count++;
				}
			}
			map.put(inputArray[i], count);
		}
		return map;

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 5, 2, 3, 4, 4 };
		HashMap<Integer, Integer> map = Occurence(array);
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
