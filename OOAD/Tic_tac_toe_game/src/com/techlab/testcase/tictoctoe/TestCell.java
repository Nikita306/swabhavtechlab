package com.techlab.testcase.tictoctoe;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.tictactoe.Cell;
import com.techlab.tictactoe.MarkType;

public class TestCell {

	@Test
	public void testCell()  {
		Cell cell = new Cell();
		cell.setMark(MarkType.O);
		System.out.println(cell.getMark());
		// cell.setMark(MarkType.X);
		 //System.out.println(cell.getMark());

	}

	@Test
	public void testIsCellEmpty() {
		Cell cell=new Cell();
		assertEquals(true, cell.isCellEmpty());
		

	}
}
