package com.techlab.humantest;

import com.techlab.human.GenderOptions;
import com.techlab.human.Human;

public class TestGender {

	public static void main(String[] args) {
		Human human = new Human("nikita", 6f, 60f, 22, GenderOptions.FEMALE);
		printDetails(human);
		Human human1 = new Human("nikhil", 6f, 60f, 22, GenderOptions.MALE);
		Human human2 = new Human("niki", 6f, 60f, 22, GenderOptions.FEMALE);
		Human human3 = new Human("radha", 6f, 60f, 22, GenderOptions.FEMALE);
		Human human4 = new Human("aditya", 6f, 60f, 22, GenderOptions.MALE);
		Human human5 = new Human("rohini", 6f, 60f, 22, GenderOptions.FEMALE);

		Human[] array = new Human[5];
		array[0] = human1;
		array[1] = human2;
		array[2] = human3;
		array[3] = human4;
		array[4] = human5;
		Human[] gender = filterGender(array);
		for (Human result : gender) {
			System.out.println(result.getName() + " is a Female");
		}
		 System.out.println("Total number of Female= "+femaleCount(array));

	}

	public static int femaleCount(Human[] h) {
		int count = 0;
		for (int i = 0; i < h.length; i++) {
			if (h[i].gender() == GenderOptions.FEMALE) {
				count++;
			}
		}
		return count;
	}

	public static void printDetails(Human h) {
		System.out.println("name=" + h.getName() + "\t" + "height="
				+ h.getHeight() + "\t" + "weight=" + h.getWeight() + "\t"
				+ "age=" + h.getAge() + "\t" + "gender=" + h.gender());
	}

	public static Human[] filterGender(Human[] h) {
		Human[] genderArray = new Human[femaleCount(h)];
		int j = 0;
		for (int i = 0; i < h.length; i++) {
			if (h[i].gender() == GenderOptions.FEMALE) {
				genderArray[j] = h[i];
				j++;
			}
		}
		return genderArray;
	}
}
