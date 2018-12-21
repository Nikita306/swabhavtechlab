package com.techlab.splitArray;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 40 };
		Object[] array = splitByTwo(input);
		for (Object result : array) {
			int[] slice = (int[]) result;
			for(int no:slice){
			System.out.print(no);
		}
			System.out.println();
	}
	}

	public static Object[] splitByTwo(int[] inputArray) {
		int[] firstHalf = new int[inputArray.length / 2];
		int[] secondHalf = new int[inputArray.length - firstHalf.length];
		Object[] result = new Object[2];
		int j = 0;
		int k = 0;

		for (int i = 0; i < inputArray.length; i++) {
			if (i < firstHalf.length) {
				firstHalf[j] = inputArray[i];
				j++;

			} else {
				secondHalf[i - firstHalf.length] = inputArray[i];
				secondHalf[k] = secondHalf[i - firstHalf.length];
				k++;
			}
		}
		result[0] = firstHalf;
		result[1] = secondHalf;
		return result;

	}
}
