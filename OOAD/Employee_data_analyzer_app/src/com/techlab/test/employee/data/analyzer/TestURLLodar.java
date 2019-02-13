package com.techlab.test.employee.data.analyzer;

import com.techlab.employee.data.analyzer.URLLoader;

public class TestURLLodar {
	public static void main(String[] args) throws Exception {
		
	URLLoader url=new URLLoader();
	System.out.println(url.load());
	System.out.println(url.load().size());
	
	}

}
