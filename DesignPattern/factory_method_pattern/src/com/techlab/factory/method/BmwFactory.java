package com.techlab.factory.method;


public class BmwFactory implements IAutomobileFactory{

	@Override
	public IAutomobile make() {
		return new Bmw();
	}
	

}
