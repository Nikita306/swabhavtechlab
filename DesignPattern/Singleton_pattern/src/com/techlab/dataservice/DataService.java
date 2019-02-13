package com.techlab.dataservice;

public class DataService {
	static DataService container;
	
	private DataService(){
		System.out.println("Data service creation");
	}
	
	public void doSomething(){
		System.out.println("Service is doing something And hashcode is:"+this.hashCode());
		
	}
	public static DataService getInstance(){
		if(container==null){
			container=new DataService();
		}
		return container;
		
	}
	

}
