package com.techlab.pattern;

public class Steps {
	public static void main(String[] args) {
		displaySteps(5);

	}

	public static void displaySteps(int number) {

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (j <= i) {
					System.out.print("# ");
				}else
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}