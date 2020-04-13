package com.flightreservation.model.service.impl;

import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.exception.TravelerException;
import com.flightreservation.model.service.ITravelerSvc;

public class TravelerSvcImpl implements ITravelerSvc{

	@Override
	public void aTraveler(Traveler traveler) throws TravelerException{
		System.out.println("Traveler Service has been enter aTraveler Method");
		// TODO Auto-generated method stub
		
	}


	@Override
	public Traveler getTraveler(int id){
		// TODO Auto-generated method stub
		System.out.println("Traveler Service has been enter getTraveler Method");
		return new Traveler(id,"username","password","firstName","lastName","email@address.com");
	}

	@Override
	public Traveler updateTraveler(int id) {
		// TODO Auto-generated method stub
		System.out.println("Traveler Service has been enter updateTraveler Method");
		return new Traveler(id ,"username","password","firstName","lastName","email@address.com");
	}

	@Override
	public Traveler deleteTraveler(int id) {
		// TODO Auto-generated method stub
		System.out.println("Traveler Service has been enter deleteTraveler Method");
		return new Traveler(id,"username","password","firstName","lastName","email@address.com");
	}

}
