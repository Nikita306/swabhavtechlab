package com.techlab.observer.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HelloListner extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello Listner call");
		
	}

}
