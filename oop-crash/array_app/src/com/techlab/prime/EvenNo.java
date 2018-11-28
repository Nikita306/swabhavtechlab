package com.techlab.prime;

public class EvenNo {
	
	public static boolean evenNumber(int num){
		if(num%2==0){
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
	boolean a=evenNumber(14);
	
		System.out.println(a);
		
		if(a==true){
			System.out.println("even no");
		}
		else{
			System.out.println("odd no");
		}
	}

}
