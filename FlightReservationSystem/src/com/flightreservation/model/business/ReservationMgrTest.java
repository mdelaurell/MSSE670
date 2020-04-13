package com.flightreservation.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.flightreservation.model.domain.Reservation;
import com.flightreservation.model.exception.ReservationException;
import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.business.*;

import junit.framework.TestCase;

class ReservationMgrTest extends TestCase {

	private Factory factory;
	private Reservation res;
	private ReservationMgr resMgr;
	private String id;

	
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		factory = new Factory();
		
		res = new Reservation("00001", "29/03/2020", "Pending", "23-APR-2020", "15:00", "23-APR-2020", "18:00", "Not Purchased");
		id = res.getReservationNumber();
		
	}

	@Test
	void testCreateAirport() throws ServiceLoadException, ReservationException{
		try {
			assertTrue(Manager.class.isAssignableFrom(ReservationMgr.class));
			assertTrue(resMgr.create(res));
			System.out.println("testCreateReservation Passed");
			
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (ReservationException e1) {
			e1.printStackTrace();
			fail("Reservation Exception ");
		}
		
	}
	
	
	@Test
	void testGetAirport() throws ServiceLoadException {
		assertTrue(Manager.class.isAssignableFrom(AirportMgr.class));
		System.out.println(resMgr.get(id));
		System.out.println("testGetReservation Passed");
	
	}
}

