package com.techlab.state.capital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class StateCapital {
	HashMap<String, String> hmap = new HashMap<String, String>();
	private String filename = "data\\state.txt";

	public HashMap<String, String> displayFile() throws Exception {
		String line;
		FileReader freader = new FileReader(this.filename);
		BufferedReader reader = new BufferedReader(freader);
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(":", 2);
			if (parts.length >= 2) {
				String state = parts[0];
				String capital = parts[1];
				hmap.put(state, capital);
			}
		}
		reader.close();
		return hmap;
	}

	public HashMap<String, String> search(String ch) throws Exception {
		HashMap<String, String> readmap = displayFile();
		HashMap<String, String> map = new HashMap<String, String>();
		for (Entry<String, String> entry : readmap.entrySet()) {
			if (entry.getKey().toString().toLowerCase().contains(ch)) {
				map.put(entry.getKey().toString(), entry.getValue());
			}
		}
			
		return map;

	}
}
