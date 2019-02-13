package com.techlab.lsp.solution;

public class TestArea {

	public static void main(String[] args) {
		shouldNotChangeWidth_IfHeightChange(new Rectangle(30, 5));

	}
	
	public static void shouldNotChangeWidth_IfHeightChange(Rectangle rectangle){
		int before=rectangle.getWeidth();
		System.out.println(before);
		rectangle.setHeight(10);
		int after=rectangle.getWeidth();
		System.out.println(after);
		
		
	}

}
