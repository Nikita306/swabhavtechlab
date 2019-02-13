package com.techlab.dogdoor;

import java.util.ArrayList;
import java.util.List;

public class DogDoor {

	private boolean open;
	private List <Bark> allowedBark=new ArrayList<Bark>();

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The DogDoor open.");
		open = true;
	}

	public void close() {
		System.out.println("The DogDoor close.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public void addAllowedBark(Bark bark) {
		allowedBark.add(bark);
	}

	public List<Bark> getAllowedBark() {
		return allowedBark;
	}

}
