package com.techlab.composite.design.pattern;

public class File implements IStorageElement {
	private String name;
	private int size;
	private String extension;

	public File(String name, int size, String extension) {
		this.name = name;
		this.size = size;
		this.extension = extension;
	}

	

	@Override
	public String printDetails() {
		return String.format("Filename:" + this.name + " " + "Size:" + this.size
				+ " " + "extension:" + this.extension);
	}



	@Override
	public void show() {
		System.out.println(("Filename:" + this.name + " " + "Size:" + this.size
				+ " " + "extension:" + this.extension));
		
	}

}
