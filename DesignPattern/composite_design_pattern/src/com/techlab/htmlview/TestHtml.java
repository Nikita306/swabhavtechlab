package com.techlab.htmlview;

public class TestHtml {

	public static void main(String[] args) {
		ControlGroup divRoot=new ControlGroup("div");
		Control inputField=new Control("input type","Hello");
		ControlGroup para=new ControlGroup("P");
		Control h1=new Control("H1", "Hello");
		Control inputField2=new Control("input type","hello");
		
		divRoot.addElement(inputField);
		para.addElement(h1);
		divRoot.addElement(para);
		divRoot.addElement(inputField2);
		System.out.println(divRoot.getHtml());
	}
}
