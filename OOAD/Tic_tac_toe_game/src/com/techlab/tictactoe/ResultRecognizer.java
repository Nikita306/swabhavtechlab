package com.techlab.tictactoe;

public class ResultRecognizer {

	public ResultRecognizer(Board board) {

	}

	private boolean isfirstHorizontal(Board board) {
		boolean result = MarkType.Empty != board.getLocationAndMark(0)
				&& board.getLocationAndMark(0) == board.getLocationAndMark(1)
				&& board.getLocationAndMark(1) == board.getLocationAndMark(2);
		return result;
	}

	private boolean isSecondHorizontal(Board board) {
		boolean result = MarkType.Empty != board.getLocationAndMark(3)
				&& board.getLocationAndMark(3) == board.getLocationAndMark(4)
				&& board.getLocationAndMark(4) == board.getLocationAndMark(5);
		return result;
	}

	private boolean isThirdHorizontal(Board board) {
		boolean result = MarkType.Empty != board.getLocationAndMark(6)
				&& board.getLocationAndMark(6) == board.getLocationAndMark(7)
				&& board.getLocationAndMark(7) == board.getLocationAndMark(8);
		return result;
	}

	private boolean isFirstVertical(Board board) {
		boolean result = MarkType.Empty != board.getLocationAndMark(0)
				&& board.getLocationAndMark(0) == board.getLocationAndMark(3)
				&& board.getLocationAndMark(3) == board.getLocationAndMark(6);
		return result;
	}

	private boolean isSecondVertical(Board board) {
		boolean result = MarkType.Empty != board.getLocationAndMark(1)
				&& board.getLocationAndMark(1) == board.getLocationAndMark(4)
				&& board.getLocationAndMark(4) == board.getLocationAndMark(7);
		return result;
	}

	private boolean isThirdVertical(Board board) {
		boolean result = MarkType.Empty != board.getLocationAndMark(2)
				&& board.getLocationAndMark(2) == board.getLocationAndMark(5)
				&& board.getLocationAndMark(5) == board.getLocationAndMark(8);
		return result;
	}

	private boolean isLeftDigonal(Board board) {
		boolean result = MarkType.Empty != board.getLocationAndMark(0)
				&& board.getLocationAndMark(0) == board.getLocationAndMark(4)
				&& board.getLocationAndMark(4) == board.getLocationAndMark(8);
		return result;
	}

	private boolean isRightDigonal(Board board) {
		boolean result = MarkType.Empty != board.getLocationAndMark(2)
				&& board.getLocationAndMark(2) == board.getLocationAndMark(4)
				&& board.getLocationAndMark(4) == board.getLocationAndMark(6);
		return result;
	}

	public Result analizeResult(Board board) {
		//Board board = new Board();
		if (isfirstHorizontal(board) || isSecondHorizontal(board)
				|| isThirdHorizontal(board) || isFirstVertical(board)
				|| isSecondVertical(board) || isThirdVertical(board)
				|| isLeftDigonal(board) || isRightDigonal(board)) {
			return Result.GAME_WIN;
		} else if (!board.isBoardFull()) {
			return Result.GAME_ON_GOINING;
		} else
			return Result.GAME_DRAWN;
	}
}
