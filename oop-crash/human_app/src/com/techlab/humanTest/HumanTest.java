package com.techlab.humanTest;

import com.techlab.human.Human;

public class HumanTest {
	public static void main(String[] args) {
		Human human1 = new Human("nikita", 6f, 60f, 22);
		Human human2 = new Human("nik", 5f, 50f, 22);
		printDetails(human1);
		printDetails(human2);
		Human human3 = new Human("trupti",22);
		printDetails2(human3);
		
		Human strong=human1.whoIsStrong(human2);
		System.out.println("who is Strong? ="+strong.getName()+" is strong");

	}

	public static void printDetails(Human h) {
		System.out.println("name=" + h.getName() + "\t" + "height="
				+ h.getHeight() + "\t" + "weight=" + h.getWeight() + "\t"
				+ "age=" + h.getAge());
	}

	public static void printDetails2(Human h) {
		System.out.println("name=" + h.getName() + "\t" + "height="
				+ h.getHeight() + "\t" + "weight=" + h.getWeight() + "\t"
				+ "age=" + h.getAge());

	}
		
	

}
