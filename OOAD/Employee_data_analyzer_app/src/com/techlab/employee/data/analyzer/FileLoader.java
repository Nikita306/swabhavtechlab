package com.techlab.employee.data.analyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileLoader implements ILoder{
	private String filename="D:\\SwabhavRepository\\OOAD\\Employee_data_analyzer_app\\employee.txt";
	

	@Override
	public ArrayList<String> load() throws Exception {
		ArrayList<String>list=new ArrayList<String>();
		FileReader reader=new FileReader(filename);
		BufferedReader br=new BufferedReader(reader);
		String line;
		while((line=br.readLine())!=null){
			list.add(line+"/n");
		}
		br.close();
		return list;
	}

}
