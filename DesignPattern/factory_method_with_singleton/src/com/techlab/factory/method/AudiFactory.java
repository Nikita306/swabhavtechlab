package com.techlab.factory.method;

public class AudiFactory implements IAutomobileFactory{
	static  AudiFactory container ;
	

	@Override
	public IAutomobile make() {
		return new Audi();
	}
	
	public static AudiFactory getInstance(){
		if(container==null){
			container=new AudiFactory();
		}
		return container;
		
	}

}
