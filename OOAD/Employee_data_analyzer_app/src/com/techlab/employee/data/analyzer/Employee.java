package com.techlab.employee.data.analyzer;

import java.util.ArrayList;

public class Employee implements Comparable<Employee>{
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String managerId;
	private String date_of_joining;
	private double salary;
	private String Commission;
	private String departmentNumber;
	private ArrayList<Employee> employeeList;

	public Employee() {
		employeeList = new ArrayList<Employee>();
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeDesignation() {
		return employeeDesignation;
	}


	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}


	public String getManagerId() {
		return managerId;
	}


	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}


	public String getDate_of_joining() {
		return date_of_joining;
	}


	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getCommission() {
		return Commission;
	}


	public void setCommission(String commission) {
		Commission = commission;
	}


	public String getDepartmentNumber() {
		return departmentNumber;
	}


	public void setDepartmentNumber(String departmentNumber) {
		this.departmentNumber = departmentNumber;
	}


	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}


	@Override
	public String toString() {
		return String.format("EmployeeId:" + this.employeeId + "  "
				+ "EmployeeName:" + this.employeeName + "  "
				+ "EmployeeDesignation:" + this.employeeDesignation + "  "
				+ "ManagerId:" + this.managerId + "  " + "Date_of_Joining:"
				+ this.date_of_joining + " " + "Salary:" + this.salary + "  "
				+ "Commission:" + this.Commission + "  " + "DepartmentNO:"
				+ this.departmentNumber);
	}
	
	@Override
	public int compareTo(Employee e) {
		if(this.employeeId==e.employeeId){
			return 0;
		}else if(this.employeeId<e.employeeId){
			return 1;
		}
		return -1;
	}

	
}
