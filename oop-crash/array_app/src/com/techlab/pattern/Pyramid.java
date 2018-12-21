package com.techlab.pattern;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		displayPyramid(5);
	}

	public static void displayPyramid(int no) {
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= no - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i + (i - 1); k++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}