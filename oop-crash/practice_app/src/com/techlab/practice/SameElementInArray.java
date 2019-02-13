package com.techlab.practice;

public class SameElementInArray {
	public static void sameElement(int[] array1, int[] array2, int[] array3) {
		int num = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					num = array1[i];
					for (int k = 0; k < array3.length; k++) {
						if (num != array3[k]) {
							array3[i] = num;
						}
					}
				}
			}
		}
		for (int e : array3) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 4, 6, 7, 9 };
		int[] array2 = { 1, 2, 4, 5, 9, 10 };
		int[] array3 = new int[array1.length];
		sameElement(array1, array2, array3);
	}

}
