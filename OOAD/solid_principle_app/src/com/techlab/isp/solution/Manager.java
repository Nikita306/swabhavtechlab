package com.techlab.isp.solution;

public class Manager implements IManager {

	@Override
	public void startWork() {
		System.out.println("Manager start working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Manager stop working");		
	}

	@Override
	public void startEat() {
		System.out.println("Manager start Eating");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Manager stop working");		
	}

}
