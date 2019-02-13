package com.techlab.practice;

public class ReverseCharArray {

	public static void main(String[] args) {
		/*String[] string={"niki"};
		int j = 0;
		char[] chararray=string[j].toCharArray();
		
		//char[] chararray = new char[] { 'n', 'i', 'k','i','t','a' };
		for (int i = chararray.length - 1; i >= 0; i--) {
			System.out.println(chararray[i]);
		}*/
		char[] array={'n','i','k'};
		reverse(array);
		
		
	}
	public static char[] reverse(char[] input){
		for(int i=input.length-1;i>=0;i--){
			System.out.println(input[i]);
		}
		
		return input;
		
	}
}
