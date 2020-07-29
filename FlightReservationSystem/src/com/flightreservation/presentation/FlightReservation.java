package com.flightreservation.presentation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;

public class FlightReservation extends JDialog {
	private JTable table;

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
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(36, 363, 822, -136);
		getContentPane().add(table);
	}
}
