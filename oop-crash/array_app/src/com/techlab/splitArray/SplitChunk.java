package com.techlab.splitArray;

import java.util.Arrays;

public class SplitChunk {
	public static void main(String[] args) {
		int chunk = 2;
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int count = inputArray.length;
		System.out.println("Input:" + Arrays.toString(inputArray)
				+ " chunk size:" + chunk);
		Object[] objectArray = SplitChunk(inputArray, chunk);
		System.out.print("Output:" + Arrays.deepToString(objectArray));
	}

	public static Object[] SplitChunk(int[] inputString, int size) {
		int size1 = inputString.length;
		int length = 0;
		if (size1 % size == 0) {
			length = inputString.length / size;
		} else {
			length = inputString.length / size + 1;
		}
		Object[] result = new Object[length];
		int count = 0;
		for (int i = 0; i < inputString.length; i += size) {
			int k = 0;
			int[] tempArray = new int[size];
			for (int j = i; j < inputString.length; j++) {
				if (k < size) {
					tempArray[k] = inputString[j];
					k++;
				}
			}
			result[count] = tempArray;
			count++;
		}
		return result;
	}

}
