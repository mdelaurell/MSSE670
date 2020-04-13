package com.flightreservation.model.domain;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class AddressTest extends TestCase{
	
	private Address address1, address2;
	
	@BeforeEach
	protected void setUp() throws Exception{
		super.setUp();
	}

	@Test

	public void testValidateEquals() {
		System.out.println("Starting the Address equals()");
		address1 = new Address ("1234 Fifth Street","","Palmer Lake","Colorado","80133","Home");
		address2 = new Address ("1234 Fifth Street","","Palmer Lake","Colorado","80133","Home");
		assertTrue("address1 equals address2", address1.equals(address2));
		System.out.println("testNotEquals PASSED");
		
	}
	
	
	@Test

	public void testValidateNotEquals() {
		System.out.println("Starting the Address equals()");
		address1 = new Address ("1234 Fifth Street","","Palmer Lake","Colorado","80133","Home");
		address2 = new Address ("777 2nd Street","","Palmer Lake","Colorado","80133","Home");
		assertFalse("address1 equals address1", address1.equals(address2));
		System.out.println("testNotEquals PASSED");
		
	}

}
