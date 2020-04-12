package com.flightreservation.model.exception;

public class FlightManagmentException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6009821813727278428L;

	
	public FlightManagmentException(final String inMessage)
    {
        super(inMessage);
    }
	
	
	public FlightManagmentException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}