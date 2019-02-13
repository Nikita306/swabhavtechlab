package com.techlab.test.factory.method;

import com.techlab.factory.method.AudiFactory;
import com.techlab.factory.method.BmwFactory;
import com.techlab.factory.method.IAutomobile;

public class TestAutomobile {
	public static void main(String[] args) {

		AudiFactory audiFactory = new AudiFactory();
		IAutomobile auto1 = audiFactory.make();
		auto1.start();
		auto1.stop();

		BmwFactory bmwfactory=new BmwFactory();
		IAutomobile auto = bmwfactory.make();
		auto.start();
		auto.stop();
		
		

	}

}
