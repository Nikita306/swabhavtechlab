package com.techlab.common.listner;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPickerFrame extends JFrame{
	JPanel panel=new JPanel();
	JButton button1=new JButton("RedButton");
	JButton button2=new JButton("BlueButton");
	CommonListener commonListener=new CommonListener(this);
	
	private Container c;
	
	public ColorPickerFrame(){
		this.setTitle("colorPicker Frame");
		this.setSize(400,200);
		this.setLayout(new FlowLayout());
		button1.addActionListener(commonListener);
		button2.addActionListener(commonListener);
		button1.setBackground(Color.red);
		button2.setBackground(Color.blue);
		panel.add(button1);
		panel.add(button2);
		c=getContentPane();
		c.add(panel);
		this.setVisible(true);
	}

	

}
