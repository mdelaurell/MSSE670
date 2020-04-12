package com.flightreservation.model.service;

import com.flightreservation.model.domain.AirlineData;
import com.flightreservation.model.exception.AirlineException;

public interface IAirlineDataSvc extends IService{
	
	public final String NAME = "IAirlineDataSvc";
	
	public void anAirline(AirlineData airline) throws AirlineException;
	public AirlineData getAirlineData(int id);
	public AirlineData updateAirlineData(int id);
	public AirlineData removeAirlineData(int id);

}
