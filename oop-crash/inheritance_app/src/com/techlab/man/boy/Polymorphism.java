package com.techlab.man.boy;

import com.techlab.man.Boy;
import com.techlab.man.Infant;
import com.techlab.man.Kid;
import com.techlab.man.Man;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atThePark(new Man());
		atThePark(new Kid());
		atThePark(new Infant());
		atThePark(new Boy());

	}

	public static void atThePark(Man x) {
		System.out.println("at the park");
		x.play();
	}

}
