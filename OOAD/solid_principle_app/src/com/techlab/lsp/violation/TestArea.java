package com.techlab.lsp.violation;

public class TestArea {

	public static void main(String[] args) {
		//shouldNotChangeWidth_IfHeightChange(new Rectangle(30, 5));
		shouldNotChangeWidth_IfHeightChange(new Square(5));

	}
	
	public static void shouldNotChangeWidth_IfHeightChange(Rectangle rectangle){
		int before=rectangle.getWidth();
		System.out.println(before);
		rectangle.setHeight(10);
		int after=rectangle.getWidth();
		System.out.println(after);
		
		
	}

}
