package com.techlab.calculator;

public class Capital {
	public static void main(String[] args) {
		String result = "hello world";
		
	System.out.println(conversionIntoCapital(result));
	}

	public static String conversionIntoCapital(String inputString) {
		
		String[] word = inputString.split(" ");
		String capital=" ";
		for (int i = 0; i < inputString.length(); i++) {
			capital=word[i].substring(0 ,1).toUpperCase()+word[i].substring(1);
			System.out.print(capital);
		}
		return capital;

	}

}
