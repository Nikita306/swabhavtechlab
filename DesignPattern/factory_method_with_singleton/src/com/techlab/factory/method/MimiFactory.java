package com.techlab.factory.method;

public class MimiFactory implements IAutomobileFactory{
	static MimiFactory container;

	@Override
	public IAutomobile make() {
		return new Mimi();
	}
	
	public static MimiFactory getInstance(){
		if(container==null){
			container=new MimiFactory();
		}
		return container;
		
	}
	

}
