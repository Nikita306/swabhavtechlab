package com.techlab.crud;

public class CustomerDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("customer created");
		
	}

	@Override
	public void read() {
		System.out.println("customer read");
	}

	@Override
	public void update() {
		System.out.println("customer update");
		
	}

	@Override
	public void delete() {
		System.out.println("customer delete");
		
	}

}
