package com.flightreservation.presentation;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.business.TravelerMgr;
import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.exception.TravelerException;
import com.flightreservation.model.service.ITravelerSvc;
import com.flightreservation.model.service.factory.Factory;


public class TravelerRegister extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4318657329148165199L;
	private JPanel contentPane;
	private JPasswordField passField;
	private JTextField userField, firstNameField,lastNameField, emailField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravelerRegister frame = new TravelerRegister();
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
	public TravelerRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 433);
		setPreferredSize(new Dimension(400, 400));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration for Flight Application");
		lblNewLabel.setBounds(95, 20, 220, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("UserName:");
		lblUserName.setBounds(73, 100, 83, 16);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(73, 133, 78, 16);
		contentPane.add(lblPassword);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(61, 166, 78, 16);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setToolTipText("");
		lblLastName.setBounds(68, 204, 71, 16);
		contentPane.add(lblLastName);
		
		JLabel lblNewLabel_1 = new JLabel("Email Address:");
		lblNewLabel_1.setBounds(41, 242, 115, 16);
		contentPane.add(lblNewLabel_1);
		
		userField = new JTextField();
		userField.setBounds(142, 95, 130, 26);
		contentPane.add(userField);
		userField.setColumns(10);
		
		passField = new JPasswordField();
		passField.setBounds(142, 128, 130, 26);
		contentPane.add(passField);
		passField.setColumns(10);
		
		firstNameField = new JTextField();
		firstNameField.setBounds(142, 161, 130, 26);
		contentPane.add(firstNameField);
		firstNameField.setColumns(10);
		
		lastNameField = new JTextField();
		lastNameField.setBounds(142, 199, 130, 26);
		contentPane.add(lastNameField);
		lastNameField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setBounds(142, 237, 130, 26);
		contentPane.add(emailField);
		emailField.setColumns(10);
		
		JButton btnRegister = new JButton("Register Traveler");
		btnRegister.setBounds(123, 288, 149, 29);
		contentPane.add(btnRegister);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	
	 btnRegister.addActionListener(
			 new ActionListener() {
					// In this Action Listener Anonymous Inner Class
				 	// We will use the Business layer Manager to create a new
				 	// Traveler and place the data into the Traveler.out file

				 public void actionPerformed(ActionEvent e)
				 {
					 try {
							Factory factory = new Factory();
							Traveler traveler;
							TravelerMgr trvlrMgr = new TravelerMgr();
							int id;
							
							traveler = new Traveler(0001, userField.getText(), passField.getPassword().toString(), firstNameField.getText(), lastNameField.getText(), emailField.getText());
							
							trvlrMgr.create(traveler);
							
						} catch (ServiceLoadException sle) {
							// TODO Auto-generated catch block
							sle.printStackTrace();
							
						} catch (TravelerException te) {
							te.printStackTrace();
		
						}	
				 }
			 }
			 
		);
	
	}
	

}
