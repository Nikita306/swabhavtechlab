package com.techlab.htmlfile;

import com.techlab.filehandling.ReadFile;
import com.techlab.filehandling.WriteFile;

public class TestFile {

	public static void main(String[] args) throws Exception {
	ReadHtmlFile read=new ReadHtmlFile();
	WriteHtmlFile write=new WriteHtmlFile();
	write.writeFile();
	read.readFile();
	}
}
