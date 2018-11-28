package com.techlab.calculator;

public class Calculator {
	public static int add(String line) {
		if (line == " ") {
			return 0;
		} 
			String[] inputnumber = line.split(",");
			int sum = 0;
			for (String num : inputnumber) {
				if (Integer.parseInt(num) >= 1000) {
					num="0";
				} 
				{
					sum = sum + Integer.parseInt(num);
				}
			}
			return sum;

		}
	}

