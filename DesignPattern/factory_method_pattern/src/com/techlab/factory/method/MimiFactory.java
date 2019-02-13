package com.techlab.factory.method;

public class MimiFactory implements IAutomobileFactory{

	@Override
	public IAutomobile make() {
		return new Mimi();
	}

}
