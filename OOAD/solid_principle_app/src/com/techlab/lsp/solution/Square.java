package com.techlab.lsp.solution;

public class Square implements Polygon{
	private int side;
	
	 public Square(int side) {
		 this.side=side;
	}

	@Override
	public int calculateArea() {
		return side*side;
	}

}
