package com.techlab.simple.factory;

public class AutomobileFactory {
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

}
