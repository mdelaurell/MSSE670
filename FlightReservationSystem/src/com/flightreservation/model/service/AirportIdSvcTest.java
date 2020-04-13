package com.flightreservation.model.service;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.exception.AirportIDException;
import com.flightreservation.model.service.factory.Factory;

import junit.framework.TestCase;

class AirportIdSvcTest extends TestCase{

	private Factory factory;
	AirportID airportId;
	IAirportSvc iaps;
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		factory = new Factory();
	}

	@Test
	public void testCreateAirport() {
		IAirportSvc iaps;
		try {
			iaps = (IAirportSvc) factory.getService("IAirportSvc");
			AirportID airport = new AirportID("DIA", "KDEN");
			iaps.anAirport(airport);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (AirportIDException e1) {
			e1.printStackTrace();
			fail("AirportID Exception");
		}

		
	}
	
	@Test
	public void testGetAirport() {
		try {
			iaps = (IAirportSvc) factory.getService("IAirportSvc");
			assertEquals("Denver International Airport",iaps.getAirport("KDEN").getAirportName());
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		
		}
	}
}
