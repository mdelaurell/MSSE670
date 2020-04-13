package com.flightreservation.model.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AirlineDataSvcTest.class, AirportIdSvcTest.class, ReservationSvcTest.class, TravelerSvcTest.class })
public class AllServiceTests {

}
