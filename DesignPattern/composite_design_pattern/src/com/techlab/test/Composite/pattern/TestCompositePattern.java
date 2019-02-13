package com.techlab.test.Composite.pattern;


import com.techlab.composite.design.pattern.File;
import com.techlab.composite.design.pattern.Folder;

public class TestCompositePattern {

	public static void main(String[] args) {
		Folder folder=new Folder("movie");
		File abc=new File("abc", 700, "text");
		Folder hindi=new Folder("hindi");
		File pqr=new File("pqr", 500, "html");
		folder.AddIteam(abc);
		folder.AddIteam(hindi);
		folder.AddIteam(pqr);
		
		//folder.show();
		System.out.println(folder.printDetails());
		
		

	}

}
