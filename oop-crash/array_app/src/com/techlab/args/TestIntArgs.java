package com.techlab.args;

public class TestIntArgs {
	public static void main(String[] args) {
		System.out.println(args.length);
		if (args.length == 0) {
			System.out.println("pass parameter");
		} else if (args.length > 1) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Addition is " + (a + b));
			System.out.println("subtraction is " + (a - b));
			System.out.println("multiplication is " + (a * b));

		} else {
			System.out.println("Add one more parameter");
		}
	}
}
