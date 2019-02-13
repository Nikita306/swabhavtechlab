package com.techlab.state.capital;

import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

	public void display() throws Exception {
		HashMap<String, String> display = displayFile();
		for (Map.Entry entry : display.entrySet()) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
	}

	public HashMap<String, String> search(String ch) throws Exception {
		HashMap<String, String> readmap = displayFile();
		for (Entry<String, String> entry : readmap.entrySet()) {
			if (entry.getKey().toString().toLowerCase().contains(ch)) {
				System.out.println(entry.getKey().toString() + ":"
						+ entry.getValue());
			}
		}
		return readmap;

	}

	/*
	 * public void searchFromFile(String search) throws Exception {
	 * HashMap<String, String> read = readFromFile(); ArrayList<String>
	 * searchKey = new ArrayList<String>(read.keySet()); for (String s :
	 * searchKey) { if (s.toLowerCase().contains(search)) {
	 * System.out.println(s.toString()); } }
	 * 
	 * }
	 */

}
