package com.flightreservation.presentation;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlightReservation extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		try {
			FlightReservation dialog = new FlightReservation();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FlightReservation() {
		setResizable(true);
		setSize(805, 410);
		setTitle("Your Flight Reservations");
		getContentPane().setLayout(null);
		
		JLabel lblFlightReservations = new JLabel("Flight Reservations");
		lblFlightReservations.setBounds(6, 6, 155, 16);
		getContentPane().add(lblFlightReservations);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(16, 34, 775, 293);
		getContentPane().add(textArea);
		
		JButton btnAddRes = new JButton("Create Reservation");
		btnAddRes.setBounds(534, 349, 155, 29);
		getContentPane().add(btnAddRes);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(682, 349, 117, 29);
		getContentPane().add(btnExit);
		
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Exit) {
				System.exit(0);
			}
		});
		
		btnAddRes.addActionListener(
				new ActionListener() {
					//have not implemented the login functionality
					// This is just a mean of showing the ability to
					// create call the functionality from this form to another.
					
					public void actionPerformed(ActionEvent addRes) {
						
						//String msg = textField.getText();
						CreateReservation resReservation = new CreateReservation();
						resReservation.setVisible(true);
						setVisible(false);
						
					}
					
				}
				);
				
			
			
		
	}
}
