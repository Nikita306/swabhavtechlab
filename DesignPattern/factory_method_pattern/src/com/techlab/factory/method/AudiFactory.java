package com.techlab.factory.method;

public class AudiFactory implements IAutomobileFactory{

	@Override
	public IAutomobile make() {
		return new Audi();
	}

}
