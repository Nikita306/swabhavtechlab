package com.techlab.test.dog.door;

import com.techlab.dog.door.BarkRecognizer;
import com.techlab.dog.door.Dogdoor;


public class DogSimulator {
	public static void main(String[] args) {
		
	

	Dogdoor door=new Dogdoor();
	BarkRecognizer recognize= new BarkRecognizer(door);
	
	System.out.println("Fib start Barking to go outside");
	recognize.recognize("woof");
	
	System.out.println("\nFibo has gone outside....");
	System.out.println("Fibo's all Done!!!");
	
	try {
		Thread.currentThread().sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("......but he's stuck Outside!");
	System.out.println("\nFibo start Barking.....");
	recognize.recognize("woof");
	System.out.println("\nFibos back inside.....");
	}
}


