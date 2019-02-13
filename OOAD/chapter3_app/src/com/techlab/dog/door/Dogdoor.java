package com.techlab.dog.door;

import java.util.Timer;
import java.util.TimerTask;

public class Dogdoor {

	private boolean open;

	public Dogdoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The DogDoor open.");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);

	}

	public void close() {
		System.out.println("The DogDoor close.");
		open = false;
	}

}
