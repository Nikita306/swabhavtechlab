package com.techlab.jframe;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeFrame extends JFrame {
	JPanel panel = new JPanel();
	JLabel loginLabel = new JLabel("login");
	
	
	public WelcomeFrame(){
		
		this.setTitle("Welcome");
		this.setSize(400, 200);
		this.setLayout(new FlowLayout());
		panel.add(loginLabel);
		this.add(panel);
		this.setVisible(true);
	}
	public void setUsername(String username) {
		loginLabel.setText(username);
		
	}
	

	
}
