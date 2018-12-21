package com.techlab.htmlfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadHtmlFile {
	public static void readFile() throws Exception {
		FileInputStream fin = new FileInputStream(
				"C:\\Users\\admin\\Desktop\\file.html");
		int i;
		while ((i = fin.read()) != -1)
			System.out.println((char) i);
		fin.close();

	}

}
