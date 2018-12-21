package com.techlab.test;

import com.techlab.man.Boy;
import com.techlab.man.IEmotional;
import com.techlab.man.IManable;
import com.techlab.man.Man;

public class TestPolymorphism {

	public static void main(String[] args) {
		Man m=new Man();
		Boy b=new Boy();
		atTheMovie(b);
		//atTheMovie(m);
		atTheParty(m);
		atTheParty(b);
		
		

	}
	public static void atTheParty(IManable man){
		System.out.println("Imanable Implement");
		man.departh();
		man.wish();
	}
	public static void atTheMovie(IEmotional emo){
		System.out.println("IEmotional Impleent");
		emo.cry();
		emo.laugh();
	}

}
