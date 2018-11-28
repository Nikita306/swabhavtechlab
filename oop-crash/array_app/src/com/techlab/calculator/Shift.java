package com.techlab.calculator;

public class Shift {
	public static void main(String[] args) {
		int[] number = new int[] { 10, 20, 30, };
		int shiftNo[] = shiftNumber(number);
		for (int shift : shiftNo) {
			System.out.println(shift);
		}
		int position[] = shiftNumber(number, 3);
		for (int shifting : position) {
			System.out.println(shifting);
		}

	}

	public static int[] shiftNumber(int[] inputNumber) {

		int temp = inputNumber[0];
		for (int i = 0; i < inputNumber.length - 1; i++) {
			inputNumber[i] = inputNumber[i + 1];
		}
		inputNumber[inputNumber.length - 1] = temp;
		return inputNumber;
	}

	public static int[] shiftNumber(int[] inputNumber, int position) {
		for (int i = position; i > 0; i--) {
			inputNumber = shiftNumber(inputNumber);

		}
		return inputNumber;

	}
}
