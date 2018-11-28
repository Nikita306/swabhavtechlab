package com.techlab.prime;

public class Even {

	public static int[] evenNumber(int even[]) {
		int k = 0;
		int[] eve = new int[9];
		boolean iseven = false;

		for (int i = 0; i < even.length; i++) {
			if (even[i] % 2 == 0) {
				iseven = true;
			} else {
				iseven = false;
			}

			if (iseven) {
				eve[k] = even[i];
				k++;

			}
		}
		return eve;

	}

	public static void main(String[] args) {

		int even[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int evencall[] = evenNumber(even);
		for (int eve : evencall) {
			System.out.println(eve);
		}
	}
}
