package com.techlab.game.console;

import java.util.Scanner;

import com.techlab.guessgame.Game;
import com.techlab.guessgame.ResultOptions;

public class GameConsole {

	public static void main(String[] args) {
		Game game = new Game();
		Scanner sc = new Scanner(System.in);
		int choice;
		int guess;
		System.out.println("Random number="+game.getRandomNo());
		do {
			System.out.println("Menu:\n 1)START \n 2)EXIT");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int j = 1;
				for (int i = 0; i < j; i++) {
					System.out.println("Enter guess");
					guess = sc.nextInt();
					game.doGuess(guess);
					if (game.doGuess(guess) == ResultOptions.TOLOW) {
						System.out.println("Too Low");
					} else if (game.doGuess(guess) == ResultOptions.TOHIGH) {
						System.out.println("Too High");
					} else {
						System.out.println("DONE!!!! Match found");
						break;
					}
					j++;
				}

				break;
			case 2:
				System.out.println("EXIT FROM GAME!!!");
				break;

			}
		} while (choice != 2);
	}

}
