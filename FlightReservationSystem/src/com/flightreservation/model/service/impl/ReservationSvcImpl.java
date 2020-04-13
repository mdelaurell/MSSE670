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
		// TODO Auto-generated method stub
		
				ObjectOutputStream output = null;
				try {
					output = new ObjectOutputStream(new FileOutputStream("ReservationData.out", true));
					output.writeObject(res);
					output.flush();
					output.close();
				}catch(IOException e) {
				}
					System.out.println("Reservation Service has been enter TravelerReservation Method");
			}	
	
	@Override
	public Reservation getReservation(String reservationNumber) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter TravelerReservation Method");
		return new Reservation("00002", "29/03/2020", "Pending", "23-APR-2020", "15:00", "23-APR-2020", "18:00", "Not Purchased");

	}
	
	@Override
	public Reservation updateReservation(String reservationNumber) {
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter saveReservation Method");
		return new Reservation("00003", "29/03/2020", "Pending", "23-APR-2020", "15:00", "23-APR-2020", "18:00", "Not Purchased");
	}

	@Override
	public Reservation deleteReservation(String reservationNumber) {
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter deleteReservation Method");
		return new Reservation("00004", "29/03/2020", "Active", "23-Nov-2020", "15:00", "23-Nov-2020", "17:40", "Purchased");
	}

	@Override
	public Reservation purchaseReservation(String reservationNumber) {
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter purchaseReservation Method");
		return new Reservation("00005", "31/03/2020", "Pending", "30-APR-2020", "16:00", "30-APR-2020", "18:30", "Flight Cancelled");
	}

}
