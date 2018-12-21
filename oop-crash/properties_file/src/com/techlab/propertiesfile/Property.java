package com.techlab.propertiesfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Property {

	public static void main(String[] args) throws Exception  {
		//FileReader reader=new FileReader("details.properties");
		FileReader reader = new FileReader("details.properties");
		Properties p=new Properties();  
		p.load(reader);
		System.out.println("UserName="+p.getProperty("username"));
		System.out.println("Password="+p.getProperty("password"));
		
	
		

	}

}
