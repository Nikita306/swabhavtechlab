package com.techlab.lsp.violation;

public class Square extends Rectangle {
	private int side;

	public Square(int side) {
		super(side, side);
	}
	
	@Override
	public void setHeight(int height1) {
		this.height=this.width=height1;
	}
	@Override
	public void setWidth(int width1) {
		this.height=this.width=width1;
	}
	
}
