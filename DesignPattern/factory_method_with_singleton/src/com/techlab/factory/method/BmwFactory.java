package com.techlab.factory.method;


public class BmwFactory implements IAutomobileFactory{
	static BmwFactory container;

	@Override
	public IAutomobile make() {
		return new Bmw();
	}
	
	public static BmwFactory getInstance(){
		if(container==null){
			container=new BmwFactory();
		}
		return container;
		
	
	}

}
