package com.techlab.lsp.solution;

public class Rectangle implements Polygon {
	private int height;
	private int weidth;

	public Rectangle(int height, int width) {
		this.height = height;
		this.weidth = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeidth() {
		return weidth;
	}

	public void setWeidth(int weidth) {
		this.weidth = weidth;
	}

	@Override
	public int calculateArea() {
		return height * weidth;
	}

}
