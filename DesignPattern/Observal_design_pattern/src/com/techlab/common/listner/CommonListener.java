package com.techlab.common.listner;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonListener implements ActionListener {
	private ColorPickerFrame frame;

	public CommonListener(ColorPickerFrame frame) {
		this.frame = frame;
		System.out.println("Listner Object Created!!!!!!!");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Common Listner Called");
		System.out.println(e.getActionCommand());
		if (e.getActionCommand().equals("RedButton")) {
			frame.getContentPane().setBackground(Color.red);
		} else if (e.getActionCommand().equals("BlueButton")) {
			frame.getContentPane().setBackground(Color.blue);
		}

	}

}
