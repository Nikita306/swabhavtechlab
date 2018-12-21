package com.techlab.employee;

public class Programmer extends Employee {
	private static final double PA;
	static {
		PA = 30;
	}

	public Programmer(String name, int id, double basicSalary) {
		super(name, id, basicSalary);
	}

	@Override
	public double annulIncome() {
		return (this.PA / 100 * this.basicSalary) + this.basicSalary;
	}

	@Override
	public String role() {
		return "programmer";
	}

}
