package com.techlab.playertest;

import com.techlab.player.Player;

public class TestOverloded {
	public static void main(String[] args) {
		System.out.println(Player.getHeadCount());
		Player player1=new Player("nikita",22);
		System.out.println(Player.getHeadCount());
		
		Player player2=new Player("nikita",22);
		System.out.println(Player.getHeadCount());
		
		Player player3=new Player("nikita",22);
		System.out.println(Player.getHeadCount());
	
	}
}
