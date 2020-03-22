package com.flightreservation.model.domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TravelerTest {
	
	private Traveler t1, t2, t3;
	
	
	
	/**
	 * @throws java.lang.Exception
	 */
	
	@Test
	
	public void testValidateEquals() {
		System.out.println("Starting the Traveler equals()");
		t1 = new Traveler ("wwallace","Fr33dom","Wiliam","Wallace","william.wallace@gmail.com");
		t2 = new Traveler ("rbruce","IamKing","Robert","Bruce","robertthebruce@scotland.com");
		assertFalse("t1 equals t2", t1.equals(t2));
		System.out.println("testNotEquals PASSED");
		
	}
	
}
