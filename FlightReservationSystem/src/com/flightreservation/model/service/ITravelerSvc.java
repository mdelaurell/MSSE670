package com.flightreservation.model.service;

import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.exception.TravelerException;

public interface ITravelerSvc extends IService{
	
	public void aTraveler(Traveler traveler) throws TravelerException;
	public Traveler getTraveler(int id);
	public Traveler updateTraveler(int id);
	public Traveler deleteTraveler(int id);

}
