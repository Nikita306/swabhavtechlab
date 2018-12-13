package com.techlab.guessgame;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu:\n 1)START \n 2)EXIT");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				guess();
				break;
			case 2:
				System.out.println("EXIT FROM GAME!!!");
				break;
			//case 3:
				//System.out.println("Invalid choice");
				//break;
			}
		} while (choice != 2);
		// randomNumber();

	}

	public static int randomNumber() {
		int number = 0;
		number = (int) (Math.random() * 100);
		return number;
	}

	public static void guess() {
		int randomNo = randomNumber();
		System.out.println("Random number" + randomNo);
		Scanner sc = new Scanner(System.in);
		int j=1;
		for (int i = 0; i < j; i++) {
			System.out.println("Enter your guess=");
			int guess = sc.nextInt();
			if (guess < randomNo) {
				System.out.println("Guess is too Less!!");
			} else if (guess > randomNo) {
				System.out.println("Guess is too Heigh");
			}

			else {
				System.out.println("DONE!!!! GuessMatch!! YOUR WIN");
				break;
			}
			j++;
		}
	}
}
