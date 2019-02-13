package com.techlab.namesorted;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class NameSorted {
	public static void main(String[] args) throws Exception {
		TreeSet<String> set = new TreeSet<String>();

		FileReader file = new FileReader("data\\name.txt");
		BufferedReader br = new BufferedReader(file);
		String name;
		while ((name = br.readLine()) != null) {
			set.add(name);
		}
		for (String str : set) {
			System.out.println(str);
		}
	}
}
