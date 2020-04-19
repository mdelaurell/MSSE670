package com.flightreservation.model.service.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.Reservation;
import com.flightreservation.model.exception.ReservationException;
import com.flightreservation.model.service.IReservationSvc;

public class ReservationSvcImpl implements IReservationSvc{

	@Override
	public void TravelerReservation(Reservation res) throws ReservationException {
		// Create a new reservation and save it to the file - 
		
				ObjectOutputStream output = null;
				try {
					output = new ObjectOutputStream(new FileOutputStream("ReservationData.out", true));
					output.writeObject(res);
					output.flush();
					output.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
					System.out.println("Reservation Service has been enter TravelerReservation Method");
			}	
	
	@Override
	public Reservation getReservation(String reservationNumber) {
		// Get the Reservation Information for Display
		ObjectInputStream input;
		Reservation savedRes = null;
		try {
			input = new ObjectInputStream(new FileInputStream("ReservationData.out"));
			savedRes = (Reservation)input.readObject();
			input.close();
			System.out.println(savedRes);
			if (savedRes != null) {
				System.out.println(savedRes);
				System.out.println("Reservation Service has been enter getReservation Method");

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
	public Reservation saveReservation(String reservationNumber) {
		// Save reservation to the file
		System.out.println("Reservation Service has been enter TravelerReservation Method");
		return new Reservation("00001", "29/03/2020", "Pending", "Devner International Airport","London Gatwick Airport","London Gatwick Airport","Edinburgh Airport","United Airlines", "British Airways","23-APR-2020", "15:00", "24-APR-2020", "06:30", "Not Purchased");


	}
	
	@Override
	public Reservation updateReservation(String reservationNumber) {
		// Update the reservation
		System.out.println("Reservation Service has been enter saveReservation Method");
		return new Reservation("00003", "29/03/2020", "Pending", "Devner International Airport","London Gatwick Airport","London Gatwick Airport","Dublin Airport","United Airlines", "British Airways","23-APR-2020", "15:00", "24-APR-2020", "06:30", "Not Purchased");

	}

	@Override
	public Reservation deleteReservation(String reservationNumber) {
		// delete the reservation from the file
		System.out.println("Reservation Service has been enter deleteReservation Method");
		return new Reservation("00004", "29/03/2020", "Pending","Edinburgh Airport", "London Gatwick Airport","London Gatwick Airport","Devner International Airport","United Airlines", "British Airways","23-APR-2020", "15:00", "24-APR-2020", "06:30", "Not Purchased");

	}

	@Override
	public Reservation purchaseReservation(String reservationNumber) {
		// Purchase the reservation by updating the status to purchase.
		System.out.println("Reservation Service has been enter purchaseReservation Method");
		return new Reservation("00001", "29/03/2020", "Pending", "Devner International Airport","London Gatwick Airport","London Gatwick Airport","Edinburgh Airport","United Airlines", "British Airways","23-APR-2020", "15:00", "24-APR-2020", "06:30", "Not Purchased");
	}

}
