package com.techlab.crud;

public class OrderDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("order created");
		
	}

	@Override
	public void read() {
		System.out.println("order read");
		
	}

	@Override
	public void update() {
		System.out.println("order update");
		
	}

	@Override
	public void delete() {
		System.out.println("order delete");
		
	}

}
