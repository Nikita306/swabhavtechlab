package com.techlab.testcase.tictoctoe;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Cell;
import com.techlab.tictactoe.MarkType;

public class TestBoard {
	Board board = new Board();
	Cell[] cell = board.getCell();

	@Test
	public void testIsBoardFull() throws Exception {
		assertEquals(false, board.isBoardFull());
		
	}
	@Test
	public void testIsBoardEmpty() throws Exception {
		assertEquals(true, board.isBoardEmpty());
	}
	
	@Test
	public void testSetLoactionAndMark()  {
		for (int i = 0; i < cell.length; i++) {
			board.setLocationAndMark(i, MarkType.X);
			System.out.print(" "+board.getLocationAndMark(i));
			
		}
	}

}
