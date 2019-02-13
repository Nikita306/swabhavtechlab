package com.techlab.composite.design.pattern;

import java.util.ArrayList;

public class Folder implements IStorageElement {
	private String name;
	ArrayList<IStorageElement> iteam = new ArrayList<IStorageElement>();

	public Folder(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void AddIteam(IStorageElement element) {
		iteam.add(element);
	}

	@Override
	public String printDetails() {
		StringBuilder builder = new StringBuilder();
		for (IStorageElement e : iteam) {
			builder.append(e.printDetails()+"\n");
		}
		builder.append("FolderName:" + this.name);
		return builder.toString();
	}

	@Override
	public void show() {
		System.out.println("FolderName:" + this.name);
		for (IStorageElement element : iteam) {
			element.show();
		}
	}

}
