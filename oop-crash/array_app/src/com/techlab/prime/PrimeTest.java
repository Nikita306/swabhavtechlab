package com.techlab.prime;

public class PrimeTest {
	public static void main(String args[]){
		int newprime[]=new int[]{3,4,5,6,7,8,9,10,11,17};
		
		Prime prime=new Prime();
		int number[]=prime.primeNumbers(newprime);
		for(int p:number){
			System.out.println(p);
			
	}
	}
}