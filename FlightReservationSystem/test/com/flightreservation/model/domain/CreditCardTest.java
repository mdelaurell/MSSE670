package com.flightreservation.model.domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreditCardTest {
	
	private CreditCard cc1, cc2, cc3;

	@Test
	
	public void testValidateEquals() {
		System.out.println("Starting the CC testVAlidateEquals()");
		cc1 = new CreditCard ("1234567891234569","102022");
		cc2 = new CreditCard ("4556788912230226","012027");
		assertFalse("cc1 equals cc2", cc1.equals(cc2));
		System.out.println("testNotEquals PASSED");
		
	}
	
	@Test 
	
	public void testValidation() {
		System.out.println("Starting Validation Test");
		cc3 = new CreditCard ("4556788912230226","012027");
		assertTrue("cc3 validates", cc3.validate());
		System.out.println("testValidation: PASSED");
	}
}
