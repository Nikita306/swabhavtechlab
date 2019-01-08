package com.techlab.pattern;

public class palindrome {

	public static void main(String[] args) {
		number(3);
		
		
	}
	public static void number(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
