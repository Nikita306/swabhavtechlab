package com.techlab.crud;

public class ProductDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("product created");
		
	}

	@Override
	public void read() {
		System.out.println("product read");
		
	}

	@Override
	public void update() {
		System.out.println("product update");
		
	}

	@Override
	public void delete() {
		System.out.println("product delete");
		
	}

}
