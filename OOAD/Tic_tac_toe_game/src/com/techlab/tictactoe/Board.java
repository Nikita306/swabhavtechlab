package com.techlab.tictactoe;

import java.util.Arrays;

public class Board {
	private int location;
	private Cell[] cell = new Cell[9];
	Cell cell1=new Cell();
	

	public Cell getCell1() {
		return cell1;
	}

	public Board() {
		for (int i = 0; i < cell.length; i++) {
			cell[i] = new Cell();
			try {
				cell[i].setMark(MarkType.Empty);
			} catch (NotAllowedToMarkInFulfieldCell e) {
			}
		}
	}

	public void setLocationAndMark(int location, MarkType mark) {
		cell[location].setMark(mark);

	}

	public MarkType getLocationAndMark(int location) {
		return cell[location].getMark();
	}

	public boolean isBoardFull() {
		for (int i = 0; i < cell.length; i++) {
			if (cell[i].getMark() == MarkType.Empty) {
				return false;
			}
		}
		return true;
	}

	public boolean isBoardEmpty() {
		for (int i = 0; i < cell.length; i++) {
			if (cell[i].getMark() != MarkType.Empty ) {
				return false;
			}
		}
		return true;

	}

	public Cell[] getCell() {
		return cell;
	}

}
