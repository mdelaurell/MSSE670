package com.flightreservation.model.service;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.domain.AirlineData;
import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.domain.Reservation;
import com.flightreservation.model.exception.ReservationException;
import com.flightreservation.model.service.factory.Factory;

import junit.framework.TestCase;

class ReservationSvcTest extends TestCase {

	private Factory factory;
	Reservation reserve;
	IReservationSvc res;
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		factory = new Factory();
	}
	
	@Test
	public void testTravelerRervation() {
		try {
			res = (IReservationSvc) factory.getService("IReservationSvc");
			Reservation reserve =new Reservation("00001", "29/03/2020", "Pending", "23-APR-2020", "15:00", "23-APR-2020", "18:00", "Not Purchased");
			res.TravelerReservation(reserve);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
		catch (ReservationException e1) {
			fail("Reservation Exception");
		}	
	}
			
	@Test
	public void testGetReservation() {
		try {
			res = (IReservationSvc) factory.getService("IReservationSvc");
			assertEquals(res.getReservation("00001").getReservationStatus(), "Pending");
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}	
	}
	/*
	@Test
	public void testSaveReservation() {
		try {
			res = (IReservationSvc) factory.getService("IReservationSvc");
			reserve = res.saveReservation(1);
			Reservation res2 = new Reservation("00002", "29/03/2020", "Pending", "23-APR-2020", "15:00", "23-APR-2020", "18:00", "Not Purchased");
			assertTrue(reserve.equals(res2));
			assertFalse(reserve == res2);
			assertEquals(reserve, res2);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}	
	}
	
	@Test
	public void testUpdateReservation() {
		try {res = (IReservationSvc) factory.getService("IReservationSvc");
			reserve = res.updateReservation(2);
			Reservation res2 = new Reservation("00003", "29/03/2020", "Pending", "23-APR-2020", "15:00", "23-APR-2020", "18:00", "Not Purchased");
			assertTrue(reserve.equals(res2));
			assertFalse(reserve == res2);
			assertEquals(reserve, res2);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}	
	}
	
	@Test
	public void testDeleteReservation() {
		try {
			res = (IReservationSvc) factory.getService("IReservationSvc");
			reserve = res.deleteReservation(3);
			Reservation res2 = new Reservation("00004", "29/03/2020", "Active", "23-Nov-2020", "15:00", "23-Nov-2020", "17:40", "Purchased");
			assertTrue(reserve.equals(res2));
			assertFalse(reserve == res2);
			assertEquals(reserve, res2);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}	
	}
	
	@Test
	public void testPurchaseReservation() {
		try{
			res = (IReservationSvc) factory.getService("IReservationSvc");
			reserve = res.purchaseReservation(4);
			Reservation res2 = new Reservation("00005", "31/03/2020", "Pending", "30-APR-2020", "16:00", "30-APR-2020", "18:30", "Flight Cancelled");
			assertTrue(reserve.equals(res2));
			assertFalse(reserve == res2);
			assertEquals(reserve, res2);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}	
	}*/
}
