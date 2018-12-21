package com.techlab.employee;

public class Analyst extends Employee{
	private static final double PERK;
	static {
		PERK = 20;
	}

	public Analyst(String name, int id, double basicSalary) {
		super(name, id, basicSalary);
	}

	@Override
	public double annulIncome() {
		return (this.PERK/ 100 * this.basicSalary)+this.basicSalary;
		
	}

	@Override
	public String role() {
		return "analyst";
	}
	

}
