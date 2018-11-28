package com.techlab.employee;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private double commission;
	
	
	
	public void setId(int id1){
		if(id1>0){
		this.id=id1;
		}
	}
	public int getId(){
		return id;
	}
	public void setFirstName(String firstName1){
		this.firstName=firstName1;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lastName1){
		this.lastName=lastName1;
	}
	public String getLastName(){
		return firstName;
	}
	public void setSalary(int salary1){
		this.salary=salary1;
	}
	public int getSalary(){
		return salary;
	}
	public void setCommission(double commission1){
		if(commission1>0.0 && commission1<1.0)
		{
		this.commission=commission1;
	   }
		
	}
	
	public double getcommission() {
		return commission;
	}
	
	
    	

}
