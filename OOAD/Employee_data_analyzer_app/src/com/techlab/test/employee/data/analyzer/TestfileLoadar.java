package com.techlab.test.employee.data.analyzer;

import com.techlab.employee.data.analyzer.FileLoader;

public class TestfileLoadar {
	public static void main(String[] args) throws Exception {
		FileLoader l=new FileLoader();
		System.out.println(l.load());
		System.out.println(l.load().size());
		
	}

}
