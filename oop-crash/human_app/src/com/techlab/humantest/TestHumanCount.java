package com.techlab.humantest;

import com.techlab.human.GenderOptions;
import com.techlab.human.Human;

public class TestHumanCount {
	public static void main(String[] args) {
		Human human1=new Human("nikita",22);
		System.out.println(human1.getCount());
		Human human2=new Human("nikita", 5f, 50f, 22,GenderOptions.MALE);
		System.out.println(human2.getCount());
		Human human3=new Human("nik", 5f, 20f, 30);
		System.out.println(human3.getCount());
	}

}
