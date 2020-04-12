package com.flightreservation.model.service;

import com.flightreservation.model.domain.FlightManagement;
import com.flightreservation.model.exception.FlightManagmentException;

public interface IManageFlightsSvc extends IService {
	
	public void ManageFlight(FlightManagement fltmng) throws FlightManagmentException;
	public FlightManagement getFlight(int id);
	public FlightManagement updateFlight(int id);
	public FlightManagement cancelFlight(int id);
	public FlightManagement deleteFlight(int id);

}
