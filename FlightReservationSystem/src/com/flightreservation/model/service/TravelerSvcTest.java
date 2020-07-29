package com.flightreservation.model.service;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.exception.TravelerException;
import com.flightreservation.model.service.factory.Factory;

import junit.framework.TestCase;

class TravelerSvcTest extends TestCase{

	private Factory factory;
	Traveler travel;
	ITravelerSvc itrs;

	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		factory = new Factory();
	}
	
	@Test
	public void aTraveler() {
		try {
			itrs = (ITravelerSvc) factory.getService("ITravelerSvc");
			Traveler trvlr = new Traveler(23, "mdelaurell", "mypassword", "Michael", "DeLaurell", "mike@email.com");
			itrs.aTraveler(trvlr);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (TravelerException e1) {
			e1.printStackTrace();
			fail("AirportID Exception");
		}	
	}
	
	@Test
	public void getTraveler() {
		try {
			ITravelerSvc itrs = (ITravelerSvc) factory.getService("ITravelerSvc");
			travel = itrs.getTraveler(0);
			Traveler trvl = new Traveler(0001,"johndoe","johnpassword","John","Doe","john.doe@address.com");
			assertTrue(travel.equals(trvl));
			assertFalse(travel == trvl);
			assertEquals(travel, trvl);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	
	@Test
	public void testUpdateTraveler() {
		try {
			ITravelerSvc itrs = (ITravelerSvc) factory.getService("ITravelerSvc");
			travel = itrs.updateTraveler(1);
			Traveler trvl = new Traveler(00001,"username","password","firstName","lastName","email@address.com");
			assertTrue(travel.equals(trvl));
	    	assertFalse(travel == trvl);
	    	assertEquals(travel, trvl);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	@Test
	public void testDeleteTraveler(){
		try {
			ITravelerSvc itrs = (ITravelerSvc) factory.getService("ITravelerSvc");
			travel = itrs.deleteTraveler(2);
			Traveler trvl = new Traveler(0001, "username","password","firstName","lastName","email@address.com");
			assertTrue(travel.equals(trvl));
			assertFalse(travel == trvl);
			assertEquals(travel, trvl);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}


}
