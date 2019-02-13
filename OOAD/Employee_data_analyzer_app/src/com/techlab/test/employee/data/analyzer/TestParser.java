package com.techlab.test.employee.data.analyzer;

import java.util.ArrayList;

import com.techlab.employee.data.analyzer.Employee;
import com.techlab.employee.data.analyzer.FileLoader;
import com.techlab.employee.data.analyzer.Parser;
import com.techlab.employee.data.analyzer.URLLoader;

public class TestParser {

	public static void main(String[] args) throws Exception {
		Parser parser=new Parser();
		
		ArrayList<Employee>result=parser.parse(new FileLoader());
		System.out.println(result.size());
		
		for(Employee e:result){
			System.out.println(e);
		}
		

	}

}
