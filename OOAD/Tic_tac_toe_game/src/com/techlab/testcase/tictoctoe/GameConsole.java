package com.techlab.testcase.tictoctoe;

import java.util.Scanner;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.MarkType;
import com.techlab.tictactoe.NotAllowedToMarkInFulfieldCell;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.Result;
import com.techlab.tictactoe.ResultRecognizer;

public class GameConsole {
	public static String display(Board board) {
		return String.format("" + board.getLocationAndMark(0) + " | "
				+ board.getLocationAndMark(1) + " | "
				+ board.getLocationAndMark(2) + "\n"
				+ board.getLocationAndMark(3) + " | "
				+ board.getLocationAndMark(4) + " | "
				+ board.getLocationAndMark(5) + "\n"
				+ board.getLocationAndMark(6) + " | "
				+ board.getLocationAndMark(7) + " | "
				+ board.getLocationAndMark(8));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		String playerName1, playerName2;
		ResultRecognizer recognize = new ResultRecognizer(board);

		System.out.println("Enter First Player Name:");
		playerName1 = sc.nextLine();
		Player player1 = new Player();
		player1.setFname(playerName1);
		player1.SetMark(MarkType.X);

		System.out.println("Enter Second Player Name:");
		playerName2 = sc.nextLine();
		Player player2 = new Player();
		player2.setFname(playerName2);
		player2.SetMark(MarkType.O);

		Game game = new Game(board, recognize, player1, player2);
		int location = 0;
		while (game.getGameState() == Result.GAME_ON_GOINING) {
			System.out.println(display(board));
			System.out.println("\n" + game.getCurrentPlayer().getFname() + " "
					+ game.getCurrentPlayer().getMark());
			System.out.println("Enter Location");
		
			location = sc.nextInt();
			try {
				System.out.println(game.play(location) + "\n");
			} catch (NotAllowedToMarkInFulfieldCell e) {
				System.out.println(e.getMessage());
			}
		}

		//if (game.play(location) == Result.GAME_WIN) {
			game.SwitchPlayer();
			System.out.println("\nGame Over!!!\nWinner is "
					+ game.getCurrentPlayer().getFname());

			System.out.println(display(board));
		
	}

}
