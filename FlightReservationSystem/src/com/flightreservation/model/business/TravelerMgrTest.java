package com.flightreservation.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.exception.AirportIDException;
import com.flightreservation.model.exception.TravelerException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.business.*;

import junit.framework.TestCase;

class TravelerMgrTest extends TestCase {

	private Factory factory;
	private Traveler trvl;
	private TravelerMgr travelerMgr;
	private int id;

	
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		factory = new Factory();
		
		trvl = new Traveler(0001,"username","password","firstName","lastName","email@address.com");

		id = trvl.getId();
		
	}

	@Test
	void testCreateTraveler() throws ServiceLoadException, TravelerException{
		try {
			assertTrue(Manager.class.isAssignableFrom(TravelerMgr.class));
			assertTrue(travelerMgr.create(trvl));
			System.out.println("testCreateTraveler Passed");
			
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (TravelerException e1) {
			e1.printStackTrace();
			fail("TravelerException Exception");
		}
		
	}
	
	
	@Test
	void testGetTravelerMgr() throws ServiceLoadException {
		assertTrue(Manager.class.isAssignableFrom(AirportMgr.class));
		System.out.println(travelerMgr.get(id));
		System.out.println("testGetTravelerMgr Passed");
	
	}
}

