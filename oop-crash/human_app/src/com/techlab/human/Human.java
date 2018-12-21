package com.techlab.human;

public class Human {
	private String name;
	private float height;
	private float weight;
	private int age;
	private GenderOptions gender;
	private static int count;

	public Human(String name, float height, float weight, int age,
			GenderOptions gender) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		this.count = count++;

	}

	public Human(String name, float height, float weight, int age) {
		this(name, height, weight, age, GenderOptions.FEMALE);

	}

	public Human(String name, int age) {
		this(name, 5f, 50f, age, GenderOptions.FEMALE);

	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public int getCount() {
		count++;
		return count;
	}

	public GenderOptions gender() {
		return gender;
	}

	public Human whoIsStrong(Human human) {
		if (this.getWeight() > human.getWeight()
				|| this.getHeight() > human.getHeight()) {
			return this;
		}

		return human;

	}
	public void play(){
		this.weight= this.getWeight()-this.getWeight()/100f*2f;
		
	}

	@Override
	public String toString() {
		return String.format("{" + "\n" + "Name=" + this.name + "\n" + "Age="
				+ this.age + "\n" + "oldString=" + super.toString() + "\n"
				+ "}");
	}

	@Override
	public boolean equals(Object temp) {
		if (this == temp) {
			return true;
		} else if (temp == null) {
			return false;
		}
		Human h = (Human) temp;
		return this.name.equals(h.name) && this.age == h.age;
	}

}
