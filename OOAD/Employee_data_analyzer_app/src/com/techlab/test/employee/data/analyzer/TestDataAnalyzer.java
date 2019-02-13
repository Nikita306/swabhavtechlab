package com.techlab.test.employee.data.analyzer;

import java.util.HashMap;
import java.util.Map;

import com.techlab.employee.data.analyzer.DataAnalyzer;
import com.techlab.employee.data.analyzer.Employee;
import com.techlab.employee.data.analyzer.Parser;

public class TestDataAnalyzer {

	public static void main(String[] args) throws Exception {
		DataAnalyzer data = new DataAnalyzer();
		Parser parser = new Parser();
		Employee employee = data.maximumSalariedEmployee(parser);
		System.out.println("Maximun salaried Employee:-");
		System.out.println("EmployeeId:" + employee.getEmployeeId() + "  "
				+ "EmployeeName:" + employee.getEmployeeName() + "  "
				+ "EmployeeDesignation:" + employee.getEmployeeDesignation()
				+ "  " + "ManagerId:" + employee.getManagerId() + "  "
				+ "Date_of_Joining:" + employee.getDate_of_joining() + " "
				+ "Salary:" + employee.getSalary() + "  " + "Commission:"
				+ employee.getCommission() + "  " + "DepartmentNO:"
				+ employee.getDepartmentNumber());

		HashMap<String, Integer> hmap = data
				.totalNumberOFEmployeeBasedOnDesignation(parser);

		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

		HashMap<String, Integer> map = data
				.totalNumberOFEmployeeBasedOnDepartmentNo(parser);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

}
