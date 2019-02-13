package com.techlab.practice;

public class MaximumOccurenceNumber {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 3, 6, 2, 3, 1, 3 };
		System.out.println("nnnnnnnnnnnnnnnnn");
		int max = 0;
		int i,j;
		for (  i = 0; i < array.length; i++) {
		       int count = 0;
		       for ( j = 0; j < array.length; j++) {
		         if (array[i]==array[j])
		             count++;
		   }
		  if (max<count){
			  max = count;
		  }
		 
		 }
		 System.out.println(max);
	}
	
	
}
