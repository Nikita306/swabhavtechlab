package com.techlab.playertest;

import com.techlab.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player player1 = new Player("sachin", 50);
		System.out.println("PlayerID=" + player1.getplayerId() + "\t" + "Name="
				+ player1.getName() + "\t" + "Age=" + player1.getAge());
	
		Player player2 = new Player("virat", 40);
		System.out.println("PlayerID=" + player2.getplayerId() + "\t" + "Name="
				+ player2.getName() + "\t" + "Age=" + player2.getAge());
		System.out.println("PlayerID=" + player1.getplayerId());
		
		Player player3 = new Player("virat", 40);
		System.out.println("PlayerID=" + player3.getplayerId());
		System.out.println("PlayerID=" + player2.getplayerId());
		
		System.out.println(player3.equals(player2));
		System.out.println(10.5);
		System.out.println(true);
		System.out.println(player1);
		System.out.println(player1.toString());
		System.out.println(player1.getAge());
		
	}

}
