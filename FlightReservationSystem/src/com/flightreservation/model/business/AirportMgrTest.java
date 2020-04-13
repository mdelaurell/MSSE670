package com.flightreservation.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.exception.AirportIDException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.business.*;

import junit.framework.TestCase;

class AirportMgrTest extends TestCase {

	private Factory factory;
	private AirportID airport;
	private AirportMgr airportMgr;
	private Class<AirportMgr> airportMgrClass = AirportMgr.class;
	private String id;

	
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		factory = new Factory();
		
		airport = new AirportID("DIA","KDEN");
		id = airport.getAirportIdent();
		
	}

	@Test
	void testCreateAirport() throws ServiceLoadException, AirportIDException{
		try {
			assertTrue(Manager.class.isAssignableFrom(airportMgrClass));
			assertTrue(airportMgr.create(airport));
			System.out.println("testCreateAirport Passed");
			
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
	void testGetAirport() throws ServiceLoadException {
		assertTrue(Manager.class.isAssignableFrom(AirportMgr.class));
		System.out.println(airportMgr.get(id));
		System.out.println("testGetAirport Passed");
	
	}
}

