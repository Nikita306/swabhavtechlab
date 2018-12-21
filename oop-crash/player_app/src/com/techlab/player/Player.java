package com.techlab.player;

public class Player {
	private static int id;
	private int playerId;
	private String name;
	private int age;
	private static int headCount;
	
	static{
		id=101;
		headCount=0;
	}

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
		playerId = id++;
		headCount++;
	}

	public int getplayerId() {
		return playerId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static int getHeadCount() {
		return headCount;

	}

	@Override
	public boolean equals(Object secoundPlayer) {
		if (this == secoundPlayer) {
			return true;
		} else if (secoundPlayer == null) {
			return false;
		}
		Player p = (Player) secoundPlayer;

		return this.name.equals(p.name) && this.age == p.age;
	}
}
