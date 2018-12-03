package com.techlab.human;

public class Human {
	private String name;
	private float height;
	private float weight;
	private int age;

	public Human(String name, float height, float weight, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public Human(String name, int age) {
		this(name,5f,50f,age);
		
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
	
	public Human whoIsStrong(Human human){
		if(this.getWeight()>human.getWeight() || this.getHeight()>human.getHeight()){
			return this;
		}
		
		return human;
		
	}

}
