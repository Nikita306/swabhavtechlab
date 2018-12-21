package com.techlab.filehandling;

public class TestFile {

	public static void main(String[] args) throws Exception {
		ReadFile read=new ReadFile();
		WriteFile write= new WriteFile();
		
		write.writeToFile("Hello"+"\n");
		read.readFromFile();

	}

}
