package com.techlab.dog.door;

public class BarkRecognizer {
	private Dogdoor door;
	
	public BarkRecognizer(Dogdoor door){
		this.door=door;
	}
	
	public void recognize(String bark){
		System.out.println("BarkRecognizer: Heard a ' "+bark+"'");
		door.open();
		
	}
}
