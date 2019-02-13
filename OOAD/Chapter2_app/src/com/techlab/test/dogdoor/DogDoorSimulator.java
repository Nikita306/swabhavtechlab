package com.techlab.test.dogdoor;

import com.techlab.dogdoor.DogDoor;
import com.techlab.dogdoor.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		
		System.out.println("Fibo barks to go outside");
		remote.preesButton();
		System.out.println("\nFibo has gone outside....");
		System.out.println("Fibo's all Done!!!");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("......but he's stuck Outside!");
		System.out.println("\nFibo start Barking.....");
		System.out.println("....so Gina grabs the remote contro.");
		remote.preesButton();
		System.out.println("\nFibos back inside.....");

	}

}
