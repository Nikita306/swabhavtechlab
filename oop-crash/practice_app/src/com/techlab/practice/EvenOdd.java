package com.techlab.practice;

import java.util.Arrays;

public class EvenOdd {
	public static void main(String[] args) {

		int[] array = { 9, 6, 3, 2, 5, 8, 7, 4, 1 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				Arrays.sort(array);
				System.out.println(array[i]);
			}
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 != 0) {
				Arrays.sort(array);
				System.out.println(array[j]);
			}

		}
	}
}
