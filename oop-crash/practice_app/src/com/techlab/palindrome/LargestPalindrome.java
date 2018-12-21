package com.techlab.palindrome;

public class LargestPalindrome {
	public static boolean palindrome(int number) {
		int r, sum = 0;
		int temp=number;
		while (number != 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		if (sum == temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int i, j = 0, mul = 0;
		int max = 0;

		for (i = 101; i < 1000; i++) {
			for (j = 101; j < 1000; j++) {
				mul = i * j;
				if (palindrome(mul) == true) {
					if (max < mul) {
						max = mul;
					}
				}
			}
			//System.out.println(max);
		}
		System.out.println("maximum palindrome="+max);
	}

}
