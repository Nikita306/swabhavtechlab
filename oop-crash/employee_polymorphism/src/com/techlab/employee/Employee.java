package com.techlab.employee;

public  abstract class Employee {
	private String name;
	private int id;
	protected double basicSalary;
	
	public Employee( String name,int id,double basicSalary){
		this.name=name;
		this.id=id;
		this.basicSalary=basicSalary;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
		
	}
	public double getBasicSalary(){
		return basicSalary;
		
	}
	public abstract double annulIncome();
	public abstract String role();
	

}
