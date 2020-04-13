package com.flightreservation.model.domain;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TravelerTest extends TestCase {
	
	private Traveler t1, t2;
	
	
	
	/**
	 * @throws java.lang.Exception
	 */
	
	@Test
	
	public void testValidateEquals() {
		System.out.println("Starting the Traveler equals()");
		t1 = new Traveler (0001,"wwallace","Fr33dom","Wiliam","Wallace","william.wallace@gmail.com");
		t2 = new Traveler (0002,"rbruce","IamKing","Robert","Bruce","robertthebruce@scotland.com");
		assertFalse("t1 equals t2", t1.equals(t2));
		System.out.println("testNotEquals PASSED");
		
	}
	
}
