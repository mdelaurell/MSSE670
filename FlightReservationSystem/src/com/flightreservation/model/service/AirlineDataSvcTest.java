package com.flightreservation.model.service;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.domain.AirlineData;
import com.flightreservation.model.exception.AirlineException;
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
			iads = (IAirlineDataSvc)factory.getService("IAirlineDataSvc");
			AirlineData airline = new AirlineData("United Airlines","UA","U.S.A");
//			airline = new AirlineData("Delta Airlines","DA", "U.S.A.");
//			airline = new AirlineData("American Airlines", "AA", "U.S.A.");
//			airline = new AirlineData("British Airways", "BA", "U.K.");
			assertTrue(iads.anAirline(airline));
			
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
			
			assertEquals("United Airlines",iads.getAirlineData("UA").getAirlineName());
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
			
			assertEquals("United Airlines",iads.getAirlineData("UA").getAirlineName());
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
			
			assertEquals("United Airlines",iads.getAirlineData("UA").getAirlineName());
		} catch (ServiceLoadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			fail("ServiceLoadExecption");
		}
	}	

		
}


