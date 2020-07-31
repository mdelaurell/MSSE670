package com.flightreservation.model.domain;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class ReservationTest extends TestCase {
	
	private Reservation r1, r2, r3;
	
	@Test

	public void testValidateEquals() {
		System.out.println("Starting the Reservation equals()");
		r1 = new Reservation (99998,"reservation Date","reservationStatus","departureAirport1","departureAirport2","arrivalAirport1","arrivalAirport2","airline1","airline2","departureDate","departureTime", "arrivalDate", "arrivalTime","bookingStatus");
		r2 = new Reservation (99997,"reservation Date","reservationStatus","departureAirport1","departureAirport2","arrivalAirport1","arrivalAirport2","airline1","airline2","departureDate","departureTime", "arrivalDate", "arrivalTime","bookingStatus");
		assertTrue("r1 equals r2", r1.equals(r2));
		System.out.println("testNotEquals PASSED");
		
	}
	@Test

	public void testValidateNotEquals() {
		System.out.println("Starting the Reservation not equals()");
		r1 = new Reservation (99996,"reservation Date","reservationStatus","departureAirport1","departureAirport2","arrivalAirport1","arrivalAirport2","airline1","airline2","departureDate","departureTime", "arrivalDate", "arrivalTime","bookingStatus");
		r2 = new Reservation (99995,"reservation Date","reservationStatus","departureAirport1","departureAirport2","arrivalAirport1","arrivalAirport2","airline1","airline2","departureDate","departureTime", "arrivalDate", "arrivalTime","bookingStatus");
		assertFalse("r1 equals r2", r1.equals(r2));
		System.out.println("testNotEquals PASSED");
		
	}
	
	@Test
	
	public void testValidates() {
		
		System.out.println("Starting the Reservation not equals()");
		r3 = new Reservation (99994,"reservation Date","reservationStatus","departureAirport1","departureAirport2","arrivalAirport1","arrivalAirport2","airline1","airline2","departureDate","departureTime", "arrivalDate", "arrivalTime","bookingStatus");
		assertTrue("r3.validates", r3.validate());
		System.out.println("testValidates(): PASSED");
		
	}

}
