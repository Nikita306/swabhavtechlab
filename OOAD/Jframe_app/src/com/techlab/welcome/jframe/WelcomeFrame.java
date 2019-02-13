package com.techlab.welcome.jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeFrame extends JFrame {
	JPanel pannel = new JPanel();
	JButton button = new JButton("OK");
	JLabel lable = new JLabel();
	private Container c;

	public WelcomeFrame() {

		setTitle("Welcome");
		setSize(600, 400);
		setLayout(new FlowLayout());
		pannel.add(button);
		c=this.getContentPane();
		c.add(pannel);
		c.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
	}
}
