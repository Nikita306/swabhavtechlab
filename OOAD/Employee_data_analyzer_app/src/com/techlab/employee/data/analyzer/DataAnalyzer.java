package com.techlab.employee.data.analyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class DataAnalyzer {

	public static Employee maximumSalariedEmployee(Parser parser)
			throws Exception {
		ArrayList<Employee> result = parser.parse(new FileLoader());
		double maximumSalary = 0;
		Employee emp = null;
		for (Employee e : result) {
			if (maximumSalary < e.getSalary()) {
				maximumSalary = e.getSalary();
				emp = e;
			}
		}
		return emp;
	}

	public HashMap<String, Integer> totalNumberOFEmployeeBasedOnDesignation(
			Parser parser) throws Exception {
		ArrayList<Employee> result = parser.parse(new FileLoader());
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (Employee e : result) {
			if (hmap.containsKey(e.getEmployeeDesignation())) {
				int count=hmap.get(e.getEmployeeDesignation());
				hmap.put(e.getEmployeeDesignation(), count+1);
			}else{
				hmap.put(e.getEmployeeDesignation(), 1);
			}

		}
		return hmap;
	}

	public HashMap<String, Integer> totalNumberOFEmployeeBasedOnDepartmentNo(
			Parser parser) throws Exception {
		ArrayList<Employee> result = parser.parse(new FileLoader());
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		int count = 0;
		for (Employee e : result) {
			if (hmap.containsKey(e.getDepartmentNumber())) {
				int count1=hmap.get(e.getDepartmentNumber());
				hmap.put(e.getDepartmentNumber(), count1+1);
			}else{
				hmap.put(e.getDepartmentNumber(), 1);
			}

		}
		return hmap;
	}
}
