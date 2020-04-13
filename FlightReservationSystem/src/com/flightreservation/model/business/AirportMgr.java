package com.flightreservation.model.business;

import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.exception.AirportIDException;
import com.flightreservation.model.service.IAirportSvc;
import com.flightreservation.model.service.IService;
import com.flightreservation.model.service.factory.Factory;

public class AirportMgr {
	
private static AirportID airport = null;
	
	public AirportMgr() {
		
	}
	
	public boolean create (AirportID airport) throws ServiceLoadException, AirportIDException
	{
	Factory factory = Factory.getInstance();
	IAirportSvc airportSvc = (IAirportSvc)factory.getService(IAirportSvc.NAME);
	airportSvc.anAirport(airport);
	return true;
	}
	
	public AirportID get(String id) throws ServiceLoadException {
		Factory factory = Factory.getInstance();
		IAirportSvc airportSvc = (IAirportSvc)factory.getService(IAirportSvc.NAME);
		return airport;
	
		
	}
	
	
	
	
	public void update(AirportID a) {
		
	}
	
	public void delete(AirportID a) {
		
	}
	
	

}
