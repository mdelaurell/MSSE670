package com.flightreservation.model.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddressTest.class, 
	AirlineDataTest.class, 
	AirportIDTest.class, 
	CreditCardTest.class,
	ReservationTest.class, 
	TravelerTest.class, 
	TravelerTest2.class })
public class AllDomainTests {

}
