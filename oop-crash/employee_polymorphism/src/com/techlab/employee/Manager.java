package com.techlab.employee;

public class Manager extends Employee {
	private static final double HRA;
	private static final double TA;
	static {
		HRA = 50;
		TA = 40;
	}

	public Manager(String name, int id, double basicSalary) {
		super(name, id, basicSalary);
	}

	@Override
	public double annulIncome() {
		return ((this.HRA+this.TA) / 100 * this.basicSalary)+this.basicSalary;
	}

	@Override
	public String role() {
		return "Manager";
		
		
	}

	

}
