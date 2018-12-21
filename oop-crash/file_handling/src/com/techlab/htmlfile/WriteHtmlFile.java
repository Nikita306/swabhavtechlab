package com.techlab.htmlfile;

import java.io.FileOutputStream;

public class WriteHtmlFile {
	public static void writeFile() throws Exception {
		String html="<html><head><body><p>This is html file</p><h1>Html page</h1></body></head></html>";
		FileOutputStream fout = new FileOutputStream(
				"C:\\Users\\admin\\Desktop\\file.html");
		byte[] b = html.getBytes();
	
		fout.write(b);
		fout.close();

	}

}
