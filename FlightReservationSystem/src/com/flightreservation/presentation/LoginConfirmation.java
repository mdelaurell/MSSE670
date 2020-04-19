package com.flightreservation.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class LoginConfirmation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginConfirmation frame = new LoginConfirmation();
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
	public LoginConfirmation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblNewLabel.setBounds(48, 70, 110, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(159, 70, 204, 42);
		contentPane.add(lblNewLabel_1);
	}
	
	public LoginConfirmation(String msg) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblNewLabel.setBounds(48, 70, 110, 42);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel(msg);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(159, 70, 110, 42);
		contentPane.add(lblNewLabel_1);
	}

}
