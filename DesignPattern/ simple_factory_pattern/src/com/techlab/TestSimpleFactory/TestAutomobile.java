package com.techlab.TestSimpleFactory;

import com.techlab.simple.factory.AutomobileFactory;
import com.techlab.simple.factory.Autotype;
import com.techlab.simple.factory.IAutomobile;

public class TestAutomobile {

	public static void main(String[] args) {
		AutomobileFactory factory=new AutomobileFactory();
		IAutomobile bmw=factory.make(Autotype.BMW);
		bmw.start();
		bmw.stop();
		System.out.println(bmw.getClass());
		
		IAutomobile audi=factory.make(Autotype.AUDI);
		audi.start();
		audi.stop();

	}

}
