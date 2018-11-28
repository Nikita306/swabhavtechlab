package com.techlab.prime;

public class EvenTest {
public static void main(String[] args) {
	int newprime[]=new int[]{1,2,3,4,5,6,7,8,9,10};
	
	Prime prime=new Prime();
	int number[]=Even.evenNumber(newprime);
	for(int p:number){
		System.out.println(p);
	}	
}
}
