package com.techlab.prime;

public class SimplePrime {
	public static boolean prime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
			return true;
	}

	public static void main(String[] args) {
		boolean primes = prime(17);
		if (primes == true) {
			System.out.println("No is  prime");
		} else {
			System.out.println("No is not Prime");
		}

	}

}
