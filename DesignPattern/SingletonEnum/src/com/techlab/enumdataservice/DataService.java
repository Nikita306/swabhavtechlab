package com.techlab.enumdataservice;

public enum DataService {
	INSTANCE,FOO;

	private DataService() {
		System.out.println("Data Service creation");
	}

	public void doSomething() {
		System.out.println("Service is doing something And hashcode is:"
				+ this.hashCode());
	}

	

}
