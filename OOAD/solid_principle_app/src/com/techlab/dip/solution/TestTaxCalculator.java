package com.techlab.dip.solution;

public class TestTaxCalculator {

	public static void main(String[] args) {
		TaxCalculator calculator=new TaxCalculator(new DBLoger());
		System.out.println(calculator.calculator(0, 0));

	}

}
