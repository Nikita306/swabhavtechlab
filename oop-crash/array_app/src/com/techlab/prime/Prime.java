package com.techlab.prime;

public class Prime {
	public int[] primeNumbers(int[] num) {
		int prime[] = new int[num.length];
		int k = 0;
		
		for (int i =0; i < num.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < num[i] ; j++) {
				if (num[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
				
				if (isPrime) {
					prime[k] = num[i];
					k++;
				}
			}
		
		return prime;

	}

}
