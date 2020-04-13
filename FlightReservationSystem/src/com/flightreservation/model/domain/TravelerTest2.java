package com.flightreservation.model.domain;

import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TravelerTest2 extends TestCase {
	
		private Traveler t1;
		
		
		
		/**
		 * @throws java.lang.Exception
		 */
		
		@Test
		
		public void testValidate() {
			System.out.println("Starting the Traveler equals()");
			t1 = new Traveler (0001,"wwallace","Fr33dom","Wiliam","Wallace","william.wallace@gmail.com");
				assertTrue("t1 validates", t1.validate());
			System.out.println("testValidate PASSED");
			
		}
		
	}



