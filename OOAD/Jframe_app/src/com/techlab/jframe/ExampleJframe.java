package com.techlab.jframe;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExampleJframe {
	static GraphicsConfiguration gc;
	public static void main(String[] args) {
		JFrame frame=new JFrame(gc);
		frame.setTitle("Nikita");
		frame.setSize(600,400);
		frame.getContentPane().setBackground(Color.ORANGE);
		JButton button=new JButton("Submit");
		JPanel p=new JPanel();
		p.add(button);
		frame.add(p);
		Label lable=new Label("JFrame Example");
		frame.add(lable);
		frame.setVisible(true);
	}

}
