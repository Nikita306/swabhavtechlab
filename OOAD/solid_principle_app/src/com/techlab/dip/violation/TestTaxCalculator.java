package com.techlab.dip.violation;

public class TestTaxCalculator {
	public static void main(String[] args) {
		TaxCalculator calculator = new TaxCalculator(LogType.DB);
		System.out.println(calculator.calculate(0, 0));
	}

}
