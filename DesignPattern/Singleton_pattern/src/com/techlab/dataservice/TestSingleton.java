package com.techlab.dataservice;

public class TestSingleton {

	public static void main(String[] args) {
		DataService.getInstance();
		DataService.getInstance().doSomething();
		DataService.getInstance().doSomething();

	}

}
