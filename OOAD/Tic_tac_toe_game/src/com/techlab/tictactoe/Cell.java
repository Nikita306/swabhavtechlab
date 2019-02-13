package com.techlab.tictactoe;

public class Cell {
	private MarkType mark = null;

	public Cell() {
		this.mark = MarkType.Empty;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark)  {
		if (isCellEmpty() == true) {
			this.mark = mark;
		} else {
			throw new NotAllowedToMarkInFulfieldCell();

		}
	}

	public boolean isCellEmpty() {
		if (mark == MarkType.Empty) {
			return true;
		} else {
		}
		return false;

	}

}