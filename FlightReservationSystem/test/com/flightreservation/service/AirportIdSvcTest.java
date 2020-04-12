package com.flightreservation.service;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.exception.AirportIDException;
//import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.service.IAirportSvc;
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
			iaps.anAirport(null);
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
			AirportID arpID = new AirportID("Denver International Airport", "KDEN");
			airportId = iaps.getAirport(0);
			assertTrue(arpID.equals(airportId));
			assertFalse(arpID == airportId);
			assertEquals(arpID, airportId);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	@Test
	public void testUpdateAirport() {
		try {
			iaps = (IAirportSvc) factory.getService("IAirportSvc");
			airportId = iaps.updateAirport(1);
			AirportID arpID = new AirportID("Edinburgh International Airport", "EEDI");
			assertTrue(arpID.equals(airportId));
			assertFalse(arpID == airportId);
			assertEquals(arpID, airportId);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}

	@Test
	public void testRemoveAirport() {
		try {
			iaps = (IAirportSvc) factory.getService("IAirportSvc");
			airportId = iaps.removeAirport(2);
			AirportID arpID = new AirportID("Frankfurt International Airport","EFRA");
			assertTrue(arpID.equals(airportId));
			assertFalse(arpID == airportId);
			assertEquals(arpID, airportId);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}

}