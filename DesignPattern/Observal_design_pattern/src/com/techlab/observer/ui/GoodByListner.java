package com.techlab.observer.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GoodByListner  implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Good bye Listner call");
	}

}
