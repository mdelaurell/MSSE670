package com.flightreservation.presentation;

import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JLabel;

public class FlightReservation extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		try {
			FlightReservation dialog = new FlightReservation();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
			String readLine = null;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FlightReservation() {
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(36, 363, 822, -156);
		getContentPane().add(table);
		
		JLabel lblFlightReservations = new JLabel("Flight Reservations");
		lblFlightReservations.setBounds(6, 6, 155, 16);
		getContentPane().add(lblFlightReservations);
	}
}
