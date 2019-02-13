package com.techlab.test.dogdoor;

import com.techlab.dogdoor.Bark;
import com.techlab.dogdoor.BarkRecognizer;
import com.techlab.dogdoor.DogDoor;
import com.techlab.dogdoor.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Bark bark = new Bark("rowlf");
		door.addAllowedBark(bark);
		door.addAllowedBark(new Bark("rooowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));
		
		BarkRecognizer recognizer=new BarkRecognizer(door);
		Remote remote=new Remote(door);
		System.out.println("Bruce start Barking to go outside");
		recognizer.recognize(bark);
		
		System.out.println("\nBruce has gone outside");
		try{
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e){}
		System.out.println("\nBruce's all done");
		System.out.println("......but heis stuck outside!");
		

	}

}
