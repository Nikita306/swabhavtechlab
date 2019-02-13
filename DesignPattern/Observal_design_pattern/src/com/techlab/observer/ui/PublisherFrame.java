package com.techlab.observer.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PublisherFrame extends JFrame {
	JPanel panel=new JPanel();
	JButton button=new JButton("Click Me");
	private Container c;
	
	public PublisherFrame(){
		this.setTitle("publisher");
		this.setSize(400,200);
		this.setLayout(new FlowLayout());
		button.addActionListener(new HelloListner());
		button.addActionListener(new GoodByListner());
		panel.add(button);
		c=this.getContentPane();
		c.add(panel);
		c.setBackground(Color.ORANGE);
		this.setVisible(true);
	}

}
