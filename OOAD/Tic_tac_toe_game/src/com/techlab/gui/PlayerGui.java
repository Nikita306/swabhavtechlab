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

public class PlayerGui extends JFrame implements ActionListener {
	JPanel panel = new JPanel();
	JLabel FirstPlayer = new JLabel("First PlayerName");
	JTextField FirstPlayerText = new JTextField(10);
	JLabel SecondPlayer = new JLabel("Second PlayerName");
	JTextField SecondPlayerText = new JTextField(10);
	JButton loginButton = new JButton("LOGIN");

	public PlayerGui() {
		this.setTitle("Login Page");
		this.setSize(600, 150);
		this.setLayout(new FlowLayout());
		panel.add(FirstPlayer);
		panel.add(FirstPlayerText);
		panel.add(SecondPlayer);
		panel.add(SecondPlayerText);
		panel.add(loginButton);
		loginButton.addActionListener(this);
		this.add(panel);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (FirstPlayerText.getText() == null
				&& SecondPlayerText.getText() == null) {
			JOptionPane.showMessageDialog(this, "Player Should be enter");
		} else {
			TicTacToeGUI gui = new TicTacToeGUI();
			gui.setCurrentPlayer(FirstPlayerText.getText(),
					SecondPlayerText.getText());
			gui.setVisible(true);
		}

	}

}
