package com.techlab.testcase.tictoctoe;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.MarkType;
import com.techlab.tictactoe.Result;
import com.techlab.tictactoe.ResultRecognizer;

public class TestResultRecognizer {
	Board board = new Board();
	ResultRecognizer result = new ResultRecognizer(board);
	
	@Test
	public void testGameOnGoining() {
		System.out.println(result.analizeResult(board));
		assertEquals(Result.GAME_ON_GOINING, result.analizeResult(board));
	}
	@Test
	public void testGameOnGoining2() {
		board.setLocationAndMark(0, MarkType.X);
		board.setLocationAndMark(1, MarkType.O);
		board.setLocationAndMark(2, MarkType.O);
		board.setLocationAndMark(3, MarkType.O);
		board.setLocationAndMark(5, MarkType.O);
		board.setLocationAndMark(6, MarkType.O);
		board.setLocationAndMark(7, MarkType.O);
		board.setLocationAndMark(8, MarkType.X);
	    System.out.println(result.analizeResult(board));
	   assertEquals(Result.GAME_ON_GOINING, result.analizeResult(board));
	}

	@Test
	public void testGameWinHorizontal() {
		board.setLocationAndMark(0, MarkType.X);
		board.setLocationAndMark(1, MarkType.X);
		board.setLocationAndMark(2, MarkType.X);
	    System.out.println("Horizontal: "+result.analizeResult(board));
	    assertEquals(Result.GAME_WIN, result.analizeResult(board));
	}
	@Test
	public void testGameWinVertical() {
		board.setLocationAndMark(0, MarkType.O);
		board.setLocationAndMark(1, MarkType.X);
		board.setLocationAndMark(2, MarkType.X);
		board.setLocationAndMark(3, MarkType.O);
		board.setLocationAndMark(4, MarkType.X);
		board.setLocationAndMark(5, MarkType.O);
		board.setLocationAndMark(6, MarkType.O);
		board.setLocationAndMark(7, MarkType.O);
		board.setLocationAndMark(8, MarkType.X);
	    System.out.println("verticle: "+result.analizeResult(board));
	   assertEquals(Result.GAME_WIN, result.analizeResult(board));
	}
	@Test
	public void testleftDiagonalWin() {
		board.setLocationAndMark(0, MarkType.X);
		board.setLocationAndMark(1, MarkType.O);
		board.setLocationAndMark(2, MarkType.O);
		board.setLocationAndMark(3, MarkType.O);
		board.setLocationAndMark(4, MarkType.X);
		board.setLocationAndMark(5, MarkType.O);
		board.setLocationAndMark(6, MarkType.O);
		board.setLocationAndMark(7, MarkType.O);
		board.setLocationAndMark(8, MarkType.X);
	    System.out.println("Left Diagonal: "+result.analizeResult(board));
	   assertEquals(Result.GAME_WIN, result.analizeResult(board));
	}
	@Test
	public void testRightDiagonalWin() {
		board.setLocationAndMark(0, MarkType.O);
		board.setLocationAndMark(1, MarkType.O);
		board.setLocationAndMark(2, MarkType.X);
		board.setLocationAndMark(3, MarkType.O);
		board.setLocationAndMark(4, MarkType.X);
		board.setLocationAndMark(5, MarkType.O);
		board.setLocationAndMark(6, MarkType.X);
		board.setLocationAndMark(7, MarkType.O);
		board.setLocationAndMark(8, MarkType.O);
	    System.out.println("Right Diagonal: "+result.analizeResult(board));
	   assertEquals(Result.GAME_WIN, result.analizeResult(board));
	}
	
	@Test
	public void testGameDrawn1() {
		board.setLocationAndMark(0, MarkType.X);
		board.setLocationAndMark(1, MarkType.O);
		board.setLocationAndMark(2, MarkType.O);
		board.setLocationAndMark(3, MarkType.O);
		board.setLocationAndMark(4, MarkType.X);
		board.setLocationAndMark(5, MarkType.X);
		board.setLocationAndMark(6, MarkType.X);
		board.setLocationAndMark(7, MarkType.X);
		board.setLocationAndMark(8, MarkType.O);
	    System.out.println("Drawn1 Result: "+result.analizeResult(board));
	   assertEquals(Result.GAME_DRAWN, result.analizeResult(board));
	}
	@Test
	public void testGameDrawn2() {
		board.setLocationAndMark(0, MarkType.O);
		board.setLocationAndMark(1, MarkType.X);
		board.setLocationAndMark(2, MarkType.X);
		board.setLocationAndMark(3, MarkType.X);
		board.setLocationAndMark(4, MarkType.O);
		board.setLocationAndMark(5, MarkType.O);
		board.setLocationAndMark(6, MarkType.O);
		board.setLocationAndMark(7, MarkType.X);
		board.setLocationAndMark(8, MarkType.X);
	    System.out.println("Drawn2 Result: "+result.analizeResult(board));
	   assertEquals(Result.GAME_DRAWN, result.analizeResult(board));
	}
}
