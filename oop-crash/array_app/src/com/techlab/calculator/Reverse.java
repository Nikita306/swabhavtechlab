package com.techlab.calculator;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int rev = reverse(-9000);
		System.out.println("reverse no is"+rev);
	}

	public static int reverse(int number) {
		int reverse = 0;

		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		return reverse;

	}
}
