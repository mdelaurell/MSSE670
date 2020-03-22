package com.flightreservation.model.domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AirportIDTest {

	private AirportID aid1, aid2, aid3;
	
	@Test
	
	public void testValidateEquals() {
		System.out.println("Starting the AirportID equals()");
		aid1 = new AirportID ("Colorado Springs Airport","KCOS");
		aid2 = new AirportID ("Denver International Airport","KDEN");
		assertFalse("aid1 equals aid2", aid1.equals(aid2));
		System.out.println("testNotEquals PASSED");
		
	}
	
	@Test void testValidation() {
		System.out.println("Starting Validation Test");
		aid3 = new AirportID("Los Angeles International Airport", "KLAX");
		assertTrue("testValidation: PASSED", aid3.validate());
	}
}
