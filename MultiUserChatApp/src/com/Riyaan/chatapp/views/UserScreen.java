package com.Riyaan.chatapp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserScreen extends JFrame{
	private JTextField useridtxt;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public static void main(String[] args) {
		
		UserScreen window = new UserScreen();
					
	}
	//function that will  acquire userid and password
	private void register() {
		String userid = useridtxt.getText();
		char[] password = passwordField.getPassword();
		System.out.println("userid " + userid +" password " +password);//classname@hashcode
	}

	
	//  Create the application.
	 
	public UserScreen() {
		setResizable(false);
		setTitle("LOGIN");
		getContentPane().setBackground(Color.WHITE);
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(303, 11, 175, 75);
		getContentPane().add(lblNewLabel);
		
		useridtxt = new JTextField();
		useridtxt.setBounds(405, 100, 315, 33);
		getContentPane().add(useridtxt);
		useridtxt.setColumns(10);
		
		JLabel pwdlbl = new JLabel("Password");
		pwdlbl.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		pwdlbl.setBounds(196, 294, 107, 33);
		getContentPane().add(pwdlbl);
		
		JLabel useridlbl = new JLabel("Userid");
		useridlbl.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		useridlbl.setBounds(196, 97, 107, 33);
		getContentPane().add(useridlbl);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(405, 297, 311, 33);
		getContentPane().add(passwordField);
		
		JButton registerbt = new JButton("Register");
		registerbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//function that will collect input fields
				register();
			}
		});
		registerbt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		registerbt.setBounds(437, 359, 132, 41);
		getContentPane().add(registerbt);
		
		JButton loginbt = new JButton("Login");
		loginbt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		loginbt.setBounds(276, 359, 132, 41);
		getContentPane().add(loginbt);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(196, 165, 88, 12);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(406, 158, 314, 33);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Phone NO.");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(196, 203, 100, 24);
		getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(405, 202, 315, 33);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("City");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(196, 244, 64, 30);
		getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(405, 246, 315, 33);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		setBackground(Color.WHITE);
		setSize( 833, 440);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
