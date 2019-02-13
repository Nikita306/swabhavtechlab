package com.techlab.dip.solution;

public class TaxCalculator {
	ILoger loger;

	public TaxCalculator(ILoger loger) {
		this.loger = loger;
	}

	public int calculator(int salary, int hours) {
		int newSalary = -1;
		try {
			return newSalary = salary / hours;
		} catch (Exception ex) {
			loger.log();

		}
		return newSalary;
	}

}
