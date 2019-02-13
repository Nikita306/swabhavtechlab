package com.techlab.simple.factory;



public class AutomobileFactory {
	static AutomobileFactory container;
	
	private AutomobileFactory(){
	}
	
	public IAutomobile make(Autotype autotype){
		if(autotype==Autotype.BMW){
			return new Bmw();
		}else if(autotype==Autotype.AUDI){
			return new Audi();
		}else if(autotype==Autotype.MIMI){
			return new Mimi();
		}else
		return null;
		
	}
	public static AutomobileFactory getInstance(){
		if(container==null){
			container=new AutomobileFactory();
		}
		return container;
		
	}

}
