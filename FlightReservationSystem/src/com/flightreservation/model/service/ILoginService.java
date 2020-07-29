package com.flightreservation.model.service;

import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.exception.LoginException;

public interface ILoginService extends IService {
	
	 public final String NAME = "ILoginService";
	
	public boolean authenticateTraveler(Traveler traveler) throws LoginException;

	void aLogin(Traveler traveler) throws LoginException;

}


	
