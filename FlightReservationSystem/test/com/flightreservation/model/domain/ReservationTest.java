package com.flightreservation.model.domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReservationTest {
	
	private Reservation r1, r2;
	
	@Test

	public void testValidateEquals() {
		System.out.println("Starting the Reservation equals()");
		r1 = new Reservation ("reservation Date","reservationTime","reservationStatus","departureDate","departureTime", "arrivalDate", "arrivalTime","bookingsttaus");
		r2 = new Reservation ("reservation Date","reservationTime","reservationStatus","departureDate","departureTime", "arrivalDate", "arrivalTime","bookingsttaus");
		assertTrue("r1 equals r2", r1.equals(r2));
		System.out.println("testNotEquals PASSED");
		
	}
	@Test

	public void testValidateNotEquals() {
		System.out.println("Starting the Reservation not equals()");
		r1 = new Reservation ("reservation Date","reservationTime","reservationStatus","departureDate","departureTime", "arrivalDate", "arrivalTime","bookingsttaus");
		r2 = new Reservation ("reservationDate","reservation Time","reservation Status","departure Date","departure Time", "arrival Date", "arrival Time","booking status");
		assertFalse("r1 equals r2", r1.equals(r2));
		System.out.println("testNotEquals PASSED");
		
	}

}
