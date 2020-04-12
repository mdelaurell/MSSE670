package com.flightreservation.model.service.impl;

import com.flightreservation.model.domain.Reservation;
import com.flightreservation.model.exception.ReservationException;
import com.flightreservation.model.service.IReservationSvc;

public class ReservationSvcImpl implements IReservationSvc{

	@Override
	public void TravelerRervation(Reservation res) throws ReservationException{
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter TravelerRervation Method");
		
	}

	@Override
	public Reservation getReservation(int id) {
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter getReservation Method");
		return new Reservation("00001", "29/03/2020", "Pending", "23-APR-2020", "15:00", "23-APR-2020", "18:00", "Not Purchased");

	}

	@Override
	public Reservation saveReservation(int id) {
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter TravelerReservation Method");
		return new Reservation("00002", "29/03/2020", "Pending", "23-APR-2020", "15:00", "23-APR-2020", "18:00", "Not Purchased");

	}
	
	@Override
	public Reservation updateReservation(int id) {
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter saveReservation Method");
		return new Reservation("00003", "29/03/2020", "Pending", "23-APR-2020", "15:00", "23-APR-2020", "18:00", "Not Purchased");
	}

	@Override
	public Reservation deleteReservation(int id) {
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter deleteReservation Method");
		return new Reservation("00004", "29/03/2020", "Active", "23-Nov-2020", "15:00", "23-Nov-2020", "17:40", "Purchased");
	}

	@Override
	public Reservation purchaseReservation(int id) {
		// TODO Auto-generated method stub
		System.out.println("Reservation Service has been enter purchaseReservation Method");
		return new Reservation("00005", "31/03/2020", "Pending", "30-APR-2020", "16:00", "30-APR-2020", "18:30", "Flight Cancelled");
	}

}
