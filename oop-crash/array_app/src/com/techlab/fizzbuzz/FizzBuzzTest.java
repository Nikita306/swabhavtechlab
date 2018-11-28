package com.techlab.fizzbuzz;

import java.util.Scanner;

public class FizzBuzzTest {
	public static void main(String args[]){
		
		findFizzBuzz();
	//	findFizzBuzz(10);
		//findFizzBuzz(15);
		//findFizzBuzz(1);
	}
	
	public static void findFizzBuzz(){
		int num;
		for(num=1;num<100;num++)
		{
		
		 if (num%3==0 && num%5==0){
			System.out.println("FizzBuzz");
		}
		 else if(num%3==0){
			System.out.println("Fizz");
		}
		else if (num%5==0){
			System.out.println("Buzz");
		}
		
		else{
			System.out.println(num);
		}
		
	}
	}

}
