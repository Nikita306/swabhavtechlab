package com.techlab.factory.method;

public class Mimi implements IAutomobile {

	@Override
	public void start() {
		System.out.println("mimi start "+hashCode());
		
	}

	@Override
	public void stop() {
		System.out.println("mimi stop "+hashCode());
		
	}

}
