package com.techlab.practice;

public class FirstAndSecondMaximum {

	public static void main(String[] args) {
		int[] array =  {100, 3000, 50, 40, 20} ;
		int firstMax = 0;
		int secondMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (firstMax < array[i]) {
				secondMax = firstMax;
				firstMax = array[i];
			} else if (secondMax < array[i]) {
				secondMax = array[i];
			}
		}
		System.out.println("First Maximum " + firstMax + " "	+ "Second Maximum " + secondMax);
	}
}
