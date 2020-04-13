package com.flightreservation.model.service;

import com.flightreservation.model.domain.AirlineData;
import com.flightreservation.model.exception.AirlineException;

public interface IAirlineDataSvc extends IService{
	
	public final String NAME = "IAirlineDataSvc";
	
	public boolean anAirline(AirlineData airline) throws AirlineException;
	public AirlineData getAirlineData(String id);
	public AirlineData updateAirlineData(String id);
	public AirlineData removeAirlineData(String id);


}
