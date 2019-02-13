package com.techlab.jframe;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {
	JPanel panel = new JPanel();
	JLabel userLabel = new JLabel("User Name");
	JTextField userText = new JTextField(10);
	JLabel passwordLabel = new JLabel("Password");
	JPasswordField passwordText = new JPasswordField(10);
	JButton loginButton = new JButton("LOGIN");

	public LoginFrame() {
		this.setTitle("Login Page");
		this.setSize(500, 200);
		this.setLayout(new FlowLayout());
		panel.add(userLabel);
		panel.add(userText);
		panel.add(passwordLabel);
		panel.add(passwordText);
		loginButton.addActionListener(this);
		panel.add(loginButton);
		this.add(panel);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String pass = passwordText.getText();
		e.getWhen();
		if (user.equals("Nikita") && pass.equals("123456")) {
			WelcomeFrame login = new WelcomeFrame();
			login.setUsername(userText.getText());
			//JLabel label=new JLabel("Welcome "+user);
			//login.add(label);
			login.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "Invalid Login");
		}

	}
}
