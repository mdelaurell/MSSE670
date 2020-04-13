package com.flightreservation.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.flightreservation.model.business.*;
import com.flightreservation.model.domain.*;
import com.flightreservation.model.service.*;

@RunWith(Suite.class)
@SuiteClasses({
	AllDomainTests.class,
	AllServiceTests.class,
	AllBusinessTests.class
})
public class AllProjectTests {

}
