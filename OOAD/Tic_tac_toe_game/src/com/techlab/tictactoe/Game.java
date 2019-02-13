package com.techlab.tictactoe;

public class Game {
	private Player player1, player2;
	private Player currentPlayer;
	Board board ;
	ResultRecognizer recognize = new ResultRecognizer(board);
	private Result gameState;

	public Game(Board board, ResultRecognizer recognize, Player player1,
			Player player2) {
		this.board=board;
		this.player1 = player1;
		this.player2 = player2;
		currentPlayer = player1;
	}

	public Result getGameState() {
		return recognize.analizeResult(board);
	}

	public Board getBoard() {
		return board;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Player SwitchPlayer() {
		if (getCurrentPlayer() == player1) {
			setCurrentPlayer(player2);
			return player2;
		} else
			setCurrentPlayer(player1);
		return player1;
	}

	public Result play(int location) {
		if (!board.isBoardFull()) {
			board.setLocationAndMark(location, currentPlayer.getMark());
			SwitchPlayer();
			return recognize.analizeResult(board);
		} else {
		}

		return Result.GAME_DRAWN;

	}

	

}
