package com.techlab.institute;

public class Professor extends Person implements Salary{
	private static final double PA=50;
	
	
	public Professor(int id, String address, String dob) {
		super(id, address, dob);
	}

	@Override
	public double salariedEployee(double basicSalary) {
		return (this.PA*100/basicSalary)+basicSalary;
		
		
	}

	

}
