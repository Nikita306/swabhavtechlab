package com.techlab.test.factory.method;

import com.techlab.factory.method.AudiFactory;
import com.techlab.factory.method.BmwFactory;
import com.techlab.factory.method.IAutomobile;
import com.techlab.factory.method.IAutomobileFactory;
import com.techlab.factory.method.MimiFactory;

public class TestAutomobile {
	public static void main(String[] args) {

		IAutomobileFactory factory = BmwFactory.getInstance();
		IAutomobile auto = factory.make();
		auto.start();
		auto.stop();
		
		IAutomobileFactory factory2=AudiFactory.getInstance();
		IAutomobile auto2=factory2.make();
		auto2.start();
		auto2.stop();
		
		IAutomobileFactory factory3=MimiFactory.getInstance();
		IAutomobile auto3=factory3.make();
		auto3.start();
		auto3.stop();

	}

}
