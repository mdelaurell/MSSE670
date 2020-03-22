package com.flightreservation.model.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AirlineDataTest {

	private AirlineData airdat1, airdat2, airdat3;
	
	@Test
	
	public void testValidateEquals() {
		System.out.println("Starting the AirportID equals()");
		airdat1 = new AirlineData ("United Airlines","UA","US");
		airdat2 = new AirlineData ("American Airlines","AA","US");
		assertFalse("airdat1 equals aid2", airdat1.equals(airdat2));
		System.out.println("testNotEquals PASSED");
		
	}
	
	@Test 
	
	public void testValidation() {
		System.out.println("Starting Validation Test");
		airdat3 = new AirlineData ("American Airlines","AA","US");
		assertTrue("airdat3 validates", airdat3.validate());
		System.out.println("testValidation: PASSED");
	}
}