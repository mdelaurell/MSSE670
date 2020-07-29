package com.flightreservation.model.service;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.exception.LoginException;
import com.flightreservation.model.exception.TravelerException;
import com.flightreservation.model.service.factory.Factory;

import junit.framework.TestCase;

class LoginSvcTest extends TestCase{

	private Factory factory;
	Traveler travel;
	ILoginService itrs;

	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		factory = new Factory();
	}
	
	@Test
	public void aLogin() {
		try {
			itrs = (ILoginService) factory.getService("ILoginService");
			Traveler trvlr = new Traveler(23, "mdelaurell", "mypassword", "Michael", "DeLaurell", "mike@email.com");
			itrs.aLogin(trvlr);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	


}
