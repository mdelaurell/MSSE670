package com.flightreservation.presentation;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import com.flighreservation.model.utilities.ReservationList;
import com.flightreservation.model.domain.Reservation;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

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
	 * 
	 * @return
	 * @throws IOException
	 */
	//This methods reads the objects from ReservationData.out file 
	// and writes them to a string which is returned to the JText Area to display
	// Updates for the CreateReservation action are reflected in the display
	
	public String getReservations() throws IOException {
		File newFile = new File("ReservationData.out");
		String[] reservations = new String[10];
		String text, resString = "";
		FileInputStream fin = new FileInputStream(newFile);
	    ObjectInputStream inputStream = new ObjectInputStream(fin);

	    Object obj = null;
	    
		try {
	    System.out.println("help me!!!");	
	    int i = 0;
	    while ((obj = inputStream.readObject()) != null) {
	      if (obj instanceof Reservation) {
	        //System.out.println(((Reservation) obj).toString());
	        text = obj.toString();
	        System.out.println(i);
	        reservations[i] = text;
	        i++;
	      }else {
	    	  System.out.println("not obj Reservation");
	      } 
	    }
	    
	    
	    fin.close();
		inputStream.close();
			
					
		}catch (EOFException eof) {
			System.out.println("");
			System.out.println("End of File Reached.");
			//System.out.println(reservations.length);
			for(int j=0; j < reservations.length; j++) {
				if (reservations[j] == null) {
					break;
				}
				System.out.println(reservations[j]);
				resString = resString + reservations[j] + "\n";
			};
		}
	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    finally {
	    	return resString;
	    }
	}
	/**
	 * Create the dialog.
	 * @throws IOException 
	 */
	public FlightReservation() throws IOException {
		setResizable(true);
		setSize(805, 410);
		setTitle("Your Flight Reservations");
		getContentPane().setLayout(null);
		
		JLabel lblFlightReservations = new JLabel("Flight Reservations");
		lblFlightReservations.setBounds(6, 6, 155, 16);
		getContentPane().add(lblFlightReservations);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 34, 775, 293);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setText(getReservations());
		
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
