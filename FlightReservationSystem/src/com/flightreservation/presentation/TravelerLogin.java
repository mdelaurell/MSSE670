package com.flightreservation.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TravelerLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravelerLogin frame = new TravelerLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TravelerLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Login or Register for Flight Reservation Application");
		lblTitle.setBounds(6, 20, 350, 29);
		contentPane.add(lblTitle);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(77, 115, 74, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(77, 156, 74, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(150, 110, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(150, 151, 130, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(160, 225, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnReg = new JButton("Register");
		btnReg.setBounds(163, 282, 117, 29);
		contentPane.add(btnReg);
		
		btnLogin.addActionListener(
				new ActionListener() {
					//have not implemented the login functionality
					// This is just a mean of showing the ability to
					// create call the functionality from this form to another.
					
					public void actionPerformed(ActionEvent login) {
						
						String msg = textField.getText();
						LoginConfirmation lgnConfirm = new LoginConfirmation(msg);
						lgnConfirm.setVisible(true);
						setVisible(false);
						
					}
					
				}
				);
		
		btnReg.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent res) {
						
						TravelerRegister travelerRegister = new TravelerRegister();
						
						travelerRegister.setVisible(true);
						setVisible(false);
						
						
					}
				}
				);
	}
}
