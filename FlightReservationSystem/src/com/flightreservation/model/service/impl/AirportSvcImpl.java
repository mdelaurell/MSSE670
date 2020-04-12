package com.flightreservation.model.service.impl;

import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.service.IAirportSvc;

public class AirportSvcImpl implements IAirportSvc{

	@Override
	public void anAirport(AirportID arpt) {
		// TODO Auto-generated method stub
		System.out.println("AiportID Service has been enter anAirportID Method");
		
	}

	@Override
	public AirportID getAirport(int id) {
		// TODO Auto-generated method stub
		System.out.println("AiportID Service has been enter getAirport Method");
		return new AirportID("Denver International Airport", "KDEN");
	}

	@Override
	public AirportID updateAirport(int id) {
		// TODO Auto-generated method stub
		System.out.println("AiportID Service has been enter updateAirport Method");
		return new AirportID("Edinburgh International Airport", "EEDI");
	}

	@Override
	public AirportID removeAirport(int id) {
		// TODO Auto-generated method stub
		System.out.println("AiportID Service has been enter removeAiport Method");
		return new AirportID("Frankfurt International Airport","EFRA");
	}

}
