package com.flightreservation.model.service;

import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.exception.AirportIDException;

public interface IAirportSvc extends IService {
	
	public final String NAME = "IAirportSvc";
	
	public void anAirport(AirportID arpt)throws AirportIDException;
	public AirportID getAirport(String id);
	public AirportID updateAirport(String id);
	public AirportID removeAirport(String id);

}
