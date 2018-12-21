package com.techlab.filehandling;

import java.io.FileInputStream;

public class ReadFile {
	public static void readFromFile() throws Exception {
		FileInputStream fin = new FileInputStream(
				"C:\\Users\\admin\\Desktop\\filename.txt");
		int i;
		while ((i = fin.read()) != -1)
			System.out.print((char) i);
		fin.close();;
	}
}
