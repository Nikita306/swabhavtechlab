package com.techlab.pattern;

public class PyramidPattern {
	public static void main(String[] args) {
		displayPyramid(10);

	}

	public static void displayPyramid(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number-i; j++) {
					System.out.print("  ");
			}
			
			for(int k=1;k<=i+(i-1);k++){
					System.out.print("# ");
			}
			for(int j=1;j<=number-i;j++)
			{
				//System.out.print("+ ");
			}
			
			System.out.println();
			}
		}
	}