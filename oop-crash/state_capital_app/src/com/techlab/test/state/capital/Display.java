package com.techlab.test.state.capital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Display {

	public static void main(String[] args) throws IOException {
		String filePath = "data\\state.txt";
		HashMap<String, String> hmap = new HashMap<String, String>();

		String line;
		FileReader freader = new FileReader(filePath);
		BufferedReader reader = new BufferedReader(freader);
		
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(":", 2);
			if (parts.length >= 2) {
				String state = parts[0];
				String capital = parts[1];
				hmap.put(state, capital);
			} else {
				System.out.println("ignoring line: " + line);
			}
		}
		
		 for (Map.Entry<String, String> entry :hmap.entrySet() )  
	            System.out.println( entry.getKey()+"---" + entry.getValue());

		reader.close();
	}

}
