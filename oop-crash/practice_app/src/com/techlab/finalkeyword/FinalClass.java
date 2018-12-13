package com.techlab.finalkeyword;

public class FinalClass {
	public static void main(String[] args) {
		final int number = 5;
		// number=6; number is a final varibale thats way it cannot be reassign
		System.out.println(number);
		//Base b = new Base();
		// show();

	}

	final class Base {
		// public void show() {
		void show() {
			System.out.println("nikita");
		}
	}

	// class Derived extends Base {
	// public void show() { cannot override the final class
	// System.out.println("trupti");
	// }
	// }
}
