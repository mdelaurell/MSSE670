package com.flightreservation.model.service;

import com.flightreservation.model.domain.Reservation;
import com.flightreservation.model.exception.ReservationException;

public interface IReservationSvc extends IService{
	
	public final String NAME = "IReservationSvc";
	
	public void TravelerReservation(Reservation res) throws ReservationException;
	public Reservation getReservation(String reservationNumber);
	public Reservation saveReservation(String reservationNumber);
	public Reservation updateReservation(String reservationNumber);
	public Reservation deleteReservation(String reservationNumber);
	public Reservation purchaseReservation(String reservationNumber);
	

}
