package com.techlab.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.techlab.testcase.tictoctoe.GameConsole;
import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.MarkType;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.Result;
import com.techlab.tictactoe.ResultRecognizer;

public class TicTacToeGUI extends JFrame implements ActionListener {
	Player player1 = new Player();
	Player player2 = new Player();
	Board board = new Board();
	ResultRecognizer recognize = new ResultRecognizer(board);
	Game game = new Game(board, recognize, player1, player2);
	//JPanel panel = new JPanel();
	JButton button[] = new JButton[9];
	JTextField text = new JTextField();
	String currentPlayer;
	int location;

	public void setCurrentPlayer(String firstPlayer, String SecondPlayer) {
		player1.setFname(firstPlayer);
		player2.setFname(SecondPlayer);
		text.setText(game.getCurrentPlayer().getFname() + "   ");
	}

	public TicTacToeGUI() {
		this.setTitle("GUI");
		this.setSize(400, 400);
		this.setLayout(null);
		text.setBounds(0, 300, 350, 20);
		player1.SetMark(MarkType.X);
		player2.SetMark(MarkType.O);
		player1 = game.getCurrentPlayer();
		for (int index = 0; index < 9; index++) {
			button[index] = new JButton();
			button[index].setText(index + "");
			this.add(button[index]);
		}

		this.add(text);
		button[0].setBounds(0, 0, 100, 100);
		button[1].setBounds(100, 0, 100, 100);
		button[2].setBounds(200, 0, 100, 100);
		button[3].setBounds(0, 100, 100, 100);
		button[4].setBounds(100, 100, 100, 100);
		button[5].setBounds(200, 100, 100, 100);
		button[6].setBounds(0, 200, 100, 100);
		button[7].setBounds(100, 200, 100, 100);
		button[8].setBounds(200, 200, 100, 100);

		button[0].addActionListener(this);
		button[1].addActionListener(this);
		button[2].addActionListener(this);
		button[3].addActionListener(this);
		button[4].addActionListener(this);
		button[5].addActionListener(this);
		button[6].addActionListener(this);
		button[7].addActionListener(this);
		button[8].addActionListener(this);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int location = Integer.parseInt(e.getActionCommand());
		System.out.println(location);

		String Currentplayername = game.getCurrentPlayer().getFname();
		game.getCurrentPlayer();
		String state = game.play(location) + "";
		
		text.setText(game.getCurrentPlayer().getFname() + " Turn");
		System.out.println(game.getCurrentPlayer().getFname());
		this.setTitle(game.getCurrentPlayer().getFname());
		MarkType mark = game.getBoard().getLocationAndMark(location);

		
		System.out.println(mark + " " + location);
		if (mark.equals(MarkType.X)) {
			button[location].setText("X");

		} else if (mark.equals(MarkType.O)) {
			button[location].setText("O");
		}
		
		
		if (state.equals(Result.GAME_WIN.toString())
				|| state.equals(Result.GAME_DRAWN.toString())) {
			Object[] option = { "CLOSE" };
			if (state.equals(Result.GAME_DRAWN)) {
				Currentplayername = "";
			}

			int result = JOptionPane.showOptionDialog(null, state + " "
					+ Currentplayername, state, JOptionPane.YES_NO_OPTION,
					JFrame.EXIT_ON_CLOSE, null, option, null);

			if (result == JOptionPane.YES_OPTION) {
				this.setVisible(false);
				this.dispose();
			} else if (result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		}

	}
}
