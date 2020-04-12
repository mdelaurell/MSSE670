package com.flightreservation.model.service;

import com.flightreservation.model.domain.Reservation;
import com.flightreservation.model.exception.ReservationException;

public interface IReservationSvc extends IService{
	
	public void TravelerRervation(Reservation res) throws ReservationException;
	public Reservation getReservation(int id);
	public Reservation saveReservation(int id);
	public Reservation updateReservation(int id);
	public Reservation deleteReservation(int id);
	public Reservation purchaseReservation(int id);
	

}
