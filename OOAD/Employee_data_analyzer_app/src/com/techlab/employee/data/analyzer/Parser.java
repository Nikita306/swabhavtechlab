package com.techlab.employee.data.analyzer;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Parser {
	Employee employee;
	private String splitBy = ",";

	public ArrayList<Employee> parse(ILoder iloder) throws Exception{
	ArrayList<Employee>list=new ArrayList<Employee>();
	
	for(String line:iloder.load()){
	String[] empDetails=line.split(splitBy);
	employee=new Employee();
	employee.setEmployeeId(Integer.parseInt(empDetails[0]));
	employee.setEmployeeName(empDetails[1]);
	employee.setEmployeeDesignation(empDetails[2]);
	employee.setManagerId(empDetails[3]);
	employee.setDate_of_joining(empDetails[4]);
	employee.setSalary(Double.parseDouble(empDetails[5]));
	employee.setCommission(empDetails[6]);
	employee.setDepartmentNumber(empDetails[7]);
	list.add(employee);
	}
	Set<Employee>set=new TreeSet<Employee>(list); 
	ArrayList<Employee>listWithoutDuplicate=new ArrayList<Employee>(set);
	return listWithoutDuplicate;
	
	}
}
