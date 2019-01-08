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
	/*	boolean primes = prime(17);
		if (primes == true) {
			System.out.println("Number is  prime");
		} else {
			System.out.println("Number is not Prime");
		}*/
		
		for(int k=2;k<100;k++){
			if(prime(k)){
				System.out.println(k);
			}
		}

	}

}
