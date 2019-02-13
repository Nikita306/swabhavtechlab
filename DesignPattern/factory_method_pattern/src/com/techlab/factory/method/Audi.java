package com.techlab.factory.method;

public class Audi implements IAutomobile{

	@Override
	public void start() {
		System.out.println("Audi start "+hashCode());
	}

	@Override
	public void stop() {
		System.out.println("Audi Stop "+hashCode());
		
	}

}
