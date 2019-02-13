package com.techlab.testcase.tictoctoe;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.tictactoe.MarkType;
import com.techlab.tictactoe.Player;

public class TestPlayer {

	@Test
	public void testPlayer1() {
		Player player =new Player("Nikita", "jadhav",MarkType.X);
		assertEquals( "Nikita",player.getFname());
		assertEquals("jadhav", player.getLname());
		assertEquals(MarkType.X, player.getMark());
		
	}
	
	@Test
	public void testPlayer2() {
		Player player =new Player("Trupti", "Mahale",MarkType.O);
		assertEquals( "Trupti",player.getFname());
		assertEquals("Mahale", player.getLname());
		assertEquals(MarkType.O, player.getMark());
		
	}

}
