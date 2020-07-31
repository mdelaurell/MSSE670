
package com.flightreservation.model.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import com.flighreservation.model.utilities.AppendableObjectOutputStream;

import com.flightreservation.model.domain.Reservation;
import com.flightreservation.model.exception.ReservationException;
import com.flightreservation.model.service.IReservationSvc;

public class ReservationSvcImpl implements IReservationSvc{

	@Override
	public void TravelerReservation(Reservation res) throws ReservationException {
		// Create a new reservation and save it to the file - 
		
				
				try {
					File file = new File("ReservationData.out");
					
					boolean append = file.exists();
					System.out.println(append);
					// Using AppendableObjectOutputStream due to corruption of file without this update.
					//This was provided via searching on web to resolve the display issue of files with Streaming.
					
					FileOutputStream fout = new FileOutputStream(file, append);
					AppendableObjectOutputStream output = new AppendableObjectOutputStream(fout, append);
					
					output.writeObject(res);
					output.flush();
					output.close();
				
				}catch(IOException e) {
					e.printStackTrace();
				}
					System.out.println("Reservation Service has been enter TravelerReservation Method");
			}	
	
	@Override
	public Reservation getReservation(int reservationNumber) {
		// Get the Reservation Information for Display
		ObjectInputStream input;
		Reservation savedRes = null;
		try {
			input = new ObjectInputStream(new FileInputStream("ReservationData.out"));
			savedRes = (Reservation)input.readObject();
			input.close();
			//System.out.println(savedRes);
			if (savedRes != null) {
				//System.out.println(savedRes);
				//System.out.println("Reservation Service has been enter getReservation Method");

			}else {
				System.out.println("No data available");
				return null;
			}
			 
		}catch (IOException e1) {
			e1.printStackTrace();
		} 
		catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		finally {
			return savedRes;
		}
	}
	
	@Override
	public Reservation getAllReservation() {
		// Get the Reservation Information for Display
		ObjectInputStream input;
		Reservation AllsavedRes = null;
		try {

	    
			 
		}
		finally {
			return AllsavedRes;
		}
	}


	@Override
	public Reservation saveReservation(String reservationNumber) {
		// Save reservation to the file
		System.out.println("Reservation Service has been enter TravelerReservation Method");
		return new Reservation(00001, "29/03/2020", "Pending", "Devner International Airport","London Gatwick Airport","London Gatwick Airport","Edinburgh Airport","United Airlines", "British Airways","23-APR-2020", "15:00", "24-APR-2020", "06:30", "Not Purchased");


	}
	
	@Override
	public Reservation updateReservation(String reservationNumber) {
		// Update the reservation
		System.out.println("Reservation Service has been enter saveReservation Method");
		return new Reservation(00003, "29/03/2020", "Pending", "Devner International Airport","London Gatwick Airport","London Gatwick Airport","Dublin Airport","United Airlines", "British Airways","23-APR-2020", "15:00", "24-APR-2020", "06:30", "Not Purchased");

	}

	@Override
	public Reservation deleteReservation(String reservationNumber) {
		// delete the reservation from the file
		System.out.println("Reservation Service has been enter deleteReservation Method");
		return new Reservation(00004, "29/03/2020", "Pending","Edinburgh Airport", "London Gatwick Airport","London Gatwick Airport","Devner International Airport","United Airlines", "British Airways","23-APR-2020", "15:00", "24-APR-2020", "06:30", "Not Purchased");

	}

	@Override
	public Reservation purchaseReservation(String reservationNumber) {
		// Purchase the reservation by updating the status to purchase.
		System.out.println("Reservation Service has been enter purchaseReservation Method");
		return new Reservation(0005, "29/03/2020", "Pending", "Devner International Airport","London Gatwick Airport","London Gatwick Airport","Edinburgh Airport","United Airlines", "British Airways","23-APR-2020", "15:00", "24-APR-2020", "06:30", "Not Purchased");
	}

}
