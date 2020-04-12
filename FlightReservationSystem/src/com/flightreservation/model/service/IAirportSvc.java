package com.flightreservation.model.service;

import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.exception.AirportIDException;

public interface IAirportSvc extends IService {
	
	public void anAirport(AirportID arpt)throws AirportIDException;
	public AirportID getAirport(int id);
	public AirportID updateAirport(int id);
	public AirportID removeAirport(int id);

}
