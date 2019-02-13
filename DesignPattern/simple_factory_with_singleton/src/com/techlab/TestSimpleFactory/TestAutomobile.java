package com.techlab.TestSimpleFactory;

import com.techlab.simple.factory.AutomobileFactory;
import com.techlab.simple.factory.Autotype;
import com.techlab.simple.factory.IAutomobile;

public class TestAutomobile {

	public static void main(String[] args) {
	AutomobileFactory factory=AutomobileFactory.getInstance();
	IAutomobile auto=factory.make(Autotype.BMW);
	auto.start();
	auto.stop();
	IAutomobile auto1=factory.make(Autotype.AUDI);
	auto1.start();
	auto1.stop();
	IAutomobile auto2=factory.make(Autotype.MIMI);
	auto2.start();
	auto2.stop();
	
	}

}
