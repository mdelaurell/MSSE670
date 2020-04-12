package com.flightreservation.service;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.domain.AirlineData;
import com.flightreservation.model.exception.AirlineException;
//import com.flightreservation.model.domain.AirlineData;
import com.flightreservation.model.service.IAirlineDataSvc;
//import com.flightreservation.model.service.ITravelerSvc;
import com.flightreservation.model.service.factory.Factory;

import junit.framework.TestCase;

class AirlineDataSvcTest extends TestCase {

	private Factory factory;
	IAirlineDataSvc iads;
	IAirlineDataSvc aldata;
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		factory = new Factory();
	}

	@Test
	public void testAnAirline() {
		try {
			iads = (IAirlineDataSvc) factory.getService("IAirlineDataSvc");
			iads.anAirline(null);
		} catch (ServiceLoadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			fail("ServiceLoadExecption");
		} catch (AirlineException e2) {
			e2.printStackTrace();
			fail("AirlineException");		
		}
	}
	
	
	@Test
	public void testGetAirlineData() {
		try {
			iads = (IAirlineDataSvc) factory.getService("IAirlineDataSvc");
			aldata = (IAirlineDataSvc) iads.getAirlineData(0);
			AirlineData ald = new AirlineData("New Airline","NA","USA");
			assertTrue(ald.equals(aldata));
		    assertFalse(ald == aldata);
		    assertEquals(ald, aldata);
		} catch (ServiceLoadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			fail("ServiceLoadExecption");
		}
	}
	

	@Test
	public void testUpdateAirlineData() {
		try {
			iads = (IAirlineDataSvc) factory.getService("IAirlineDataSvc");
			aldata = (IAirlineDataSvc) iads.updateAirlineData(1);
			AirlineData ald = new AirlineData("Update Airline","UA","United Kingdom");
			assertTrue(ald.equals(aldata));
			assertFalse(ald == aldata);
			assertEquals(ald, aldata);
		} catch (ServiceLoadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			fail("ServiceLoadExecption");
		}
	}
	
	@Test
	public void testRemoveAirlineData(){
		try {
			iads = (IAirlineDataSvc) factory.getService("IAirlineDataSvc");
			aldata = (IAirlineDataSvc) iads.removeAirlineData(2);
			AirlineData ald = new AirlineData("Remove Airport", "RA", "Germany");
			assertTrue(ald.equals(aldata));
		    assertFalse(ald == aldata);
		    assertEquals(ald, aldata);
		} catch (ServiceLoadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			fail("ServiceLoadExecption");
		}
	}

		
}


