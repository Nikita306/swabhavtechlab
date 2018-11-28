package com.techlab.args;

public class TestArgs {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		if (args.length == 0) {
			System.out.println("pass the variable");
		} else {
			for(int i=0;i<args.length;i++){
			System.out.println("hello " + args[i]);
			}
		}
	}
}
