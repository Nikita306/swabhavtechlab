package com.techlab.testcase.tictoctoe;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.MarkType;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.ResultRecognizer;

public class TestGame {

	@Test
	public void testSwithPlayer() {
		Board board=new Board();
		ResultRecognizer recognize=new ResultRecognizer(board);
		Player player1=new Player("Nikita", "Jadhav", MarkType.X);
		Player player2=new Player("Trupti", "Mahale", MarkType.O);
		Game game=new Game(board, recognize, player1, player2);
	//	System.out.println(game.getCurrentPlayer().getFname());
		game.SwitchPlayer();
		//System.out.println(game.getCurrentPlayer().getFname());
	}
	
	
	@Test
	public void testPlay(){
		Board board=new Board();
		ResultRecognizer recognize=new ResultRecognizer(board);
		Player player1=new Player("Nikita", "Jadhav", MarkType.X);
		Player player2=new Player("Trupti", "Mahale", MarkType.O);
		Game game=new Game(board, recognize, player1, player2);
		System.out.println(game.getCurrentPlayer().getFname()+" "+game.getCurrentPlayer().getMark());
		System.out.println(game.play(0));
		System.out.println(game.play(3));
		System.out.println(game.play(1));
		System.out.println(game.play(4));
		System.out.println(game.play(2));
		System.out.println(game.play(5));
		System.out.println(game.play(6));
		System.out.println(game.play(7));
		System.out.println(game.play(8));
		//System.out.println(game.play(2));
		
	}
	@Test
	public void testGameState(){
		Board board=new Board();
		ResultRecognizer recognize=new ResultRecognizer(board);
		Player player1=new Player("Nikita", "Jadhav", MarkType.X);
		Player player2=new Player("Trupti", "Mahale", MarkType.O);
		Game game=new Game(board, recognize, player1, player2);
		System.out.println("----------------------"+game.getGameState());
		
	}

}
