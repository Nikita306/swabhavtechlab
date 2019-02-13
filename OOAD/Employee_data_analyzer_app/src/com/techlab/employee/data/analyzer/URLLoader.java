package com.techlab.employee.data.analyzer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class URLLoader implements ILoder {
	private static String urlLink="https://swabhav-tech.firebaseapp.com/emp.txt";

	@Override
	public ArrayList<String> load() throws Exception{
		ArrayList<String> list=new ArrayList<String>();
		URL url=new URL(urlLink);
		URLConnection connection=url.openConnection();
		InputStreamReader isr=new InputStreamReader(connection.getInputStream());
		BufferedReader br=new BufferedReader(isr);
		String line;
		while((line=br.readLine())!=null){
			list.add(line+"/n");
		}
		br.close();
		return list;
		
	}

	

}
