package com.flightreservation.model.business;

import com.flightreservation.model.domain.Reservation;
import com.flightreservation.model.exception.ReservationException;
import com.flightreservation.model.service.IAirportSvc;
import com.flightreservation.model.service.IReservationSvc;
import com.flightreservation.model.service.factory.Factory;

public class ReservationMgr {

	private static Reservation reservation = null;
	public ReservationMgr() {
		
	}
	
	public boolean create (Reservation res) throws ServiceLoadException, ReservationException
	{
	Factory factory = Factory.getInstance();
	IReservationSvc reservationSvc = (IReservationSvc)factory.getService(IReservationSvc.NAME);
	reservationSvc.TravelerReservation(res);
	return true;
	}
	
	public Reservation get(String id) throws ServiceLoadException {
		Factory factory = Factory.getInstance();
		IAirportSvc airportSvc = (IAirportSvc)factory.getService(IAirportSvc.NAME);
		return reservation;
	
		
	}
	
	public void update(Reservation r) {
		
	}
	
	public void delete(Reservation r) {
		
	}
	
	

}