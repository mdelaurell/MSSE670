package com.flightreservation.model.domain;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TravelerTest2 {
	
		private Traveler t1, t2, t3;
		
		
		
		/**
		 * @throws java.lang.Exception
		 */
		
		@Test
		
		public void testValidate() {
			System.out.println("Starting the Traveler equals()");
			t1 = new Traveler ("wwallace","Fr33dom","Wiliam","Wallace","william.wallace@gmail.com");
				assertTrue("t1 validates", t1.validate());
			System.out.println("testValidate PASSED");
			
		}
		
	}



