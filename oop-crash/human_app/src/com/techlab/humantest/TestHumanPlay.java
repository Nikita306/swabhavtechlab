package com.techlab.humantest;

import com.techlab.human.Human;

public class TestHumanPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human("nikita", 5f, 70f, 22);
		System.out.println("Before weight=" + human.getWeight());
		human.play();
		System.out.println("After weight="+human.getWeight());

	}
	
}
