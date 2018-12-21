package com.techlab.filehandling;

import java.io.FileOutputStream;

public class WriteFile {
	public static void writeToFile(String data) throws Exception{
		FileOutputStream fout = new FileOutputStream(
				"C:\\Users\\admin\\Desktop\\filename.txt",true);
		byte b[] = data.getBytes();
		fout.write(b);
		//System.out.println("hello");
		
		fout.flush();;
		fout.close();
		
	}

}
