package com.techlab.test.state.capital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

import com.techlab.state.capital.StateCapital;

public class DisplayStateCapital {
	static final int Display = 1;
	static final int Search = 2;

	public static void main(String[] args) throws Exception {
		StateCapital state = new StateCapital();

		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out
					.println("Menu:\n 1)Display State and Capital \n 2)Search State and Capital \n 3)Exit");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case Display:
				state.display();
				break;
			case Search:
				System.out.println("search----------");
				System.out.println("Enter character:");
				String ch=sc.next();
				state.search(ch);
				break;
			default:System.out.println("Exit!!!Thank u");

			}
		} while (choice != 3);

	}
}
